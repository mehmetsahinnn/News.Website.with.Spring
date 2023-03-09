package com.msahin.website.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
class NewsController {
     @GetMapping("/")
    public String getNews() {
        return "index";
    }

    @GetMapping("/add")
    public String addNews() {
        return "add-news";
    }

    @ModelAttribute("navbar")
    public String navbar() {
        return "nav";
    }
}
