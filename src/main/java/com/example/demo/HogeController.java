package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HogeController {

    @GetMapping("/hoge")
    public String hoge(@ModelAttribute SearchForm searchForm, Model model){
        return "hoge";
    }

    @PostMapping("/search")
    public String search(SearchForm searchForm, Model model){
        System.out.println(searchForm.getSearchName());
        System.out.println(searchForm.getBirthday());
        return "hoge";
    }
}
