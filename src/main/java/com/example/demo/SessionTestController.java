package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sessiontest")
public class SessionTestController {

    @Autowired
    private Messages messages;

    @ModelAttribute(name="bizMsg")
    public Messages getMessages(){
        return messages;
    }
    
    @ModelAttribute("sessionSearchForm")
    public SearchForm getSessionSearchForm(){
        System.out.println("model attribute.");
        return new SearchForm();
    }

    @RequestMapping
    public String index(){
        return "sessiontest";
    }

    @RequestMapping("/confirm")
    public String confirm(@ModelAttribute("sessionSearchForm") SearchForm sessionSearchForm, Model model, HttpServletRequest request){
        System.out.println("confirm:" + sessionSearchForm);
        String exhandled = (String) request.getAttribute("exhandled");
        System.out.println("flag:"+exhandled);
        if("error".equals(sessionSearchForm.getSearchName())){
            if(exhandled == null){
                throw new IllegalStateException("例外処理");
            }
        }
        return "sessiontestconfirm";
    }

    @RequestMapping("/register")
    public String register(SearchForm sessionSearchForm){
        System.out.println("sessiontestcomplete:" + sessionSearchForm);
        return "sessiontestcomplete";
    }
    
    @ExceptionHandler
    public String handleException(IllegalStateException ex, HttpServletRequest request){
        System.out.println("handleException");
        messages.setMsg(ex.getMessage());
        request.setAttribute("exhandled", "処理済み");
        return "forward:/sessiontest/confirm";
    }
}
