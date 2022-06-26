package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mod")
public class ModController {

    @Autowired
    private Messages messages;

    @ModelAttribute(name="bizMsg")
    public Messages getMessages(){
        return messages;
    }

    @ModelAttribute(name="hoge")
    public String getHoge(String hoge){
        System.out.println("ModController#getHoge="+hoge);
        return "AIUEO";
    }

    @RequestMapping
    public String index(String query){
        System.out.println("index:messages="+messages);
        messages.setMsg("query="+query);
        System.out.println("index:messages="+messages);
        return "foo";
    }
}
