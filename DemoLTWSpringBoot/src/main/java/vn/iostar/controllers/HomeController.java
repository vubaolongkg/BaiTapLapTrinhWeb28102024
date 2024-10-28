package vn.iostar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "home";
    }
    @GetMapping("/t")
    public String index2() {
        return "home2";
    }
}
