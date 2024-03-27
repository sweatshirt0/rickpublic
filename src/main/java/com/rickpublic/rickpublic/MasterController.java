package com.rickpublic.rickpublic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MasterController {
    @GetMapping("/")
    public String renderHome() {
        return "index";
    }

    @GetMapping("/style")
    public String renderStyle() {
        return "style.css";
    }
}
