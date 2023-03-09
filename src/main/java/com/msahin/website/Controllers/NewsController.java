package com.msahin.website.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class NewsController {
     @GetMapping("/")
    public String getNews() {
        return "index";
    }
}
