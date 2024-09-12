package com.technio.scm.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("name", "Substring");
        model.addAttribute("age", 12);
        model.addAttribute("github","https://github.com/anwararquam");
        return "home";
    }
    @RequestMapping("/about")
    public String about(Model model) {
        model.addAttribute("isLogin", false);
        return "about";
    }
    @RequestMapping("/services")
    public String services(Model model) {
        return "services";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @GetMapping("/signup")
    public String signup() {
        return "register";
    }
    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
}
