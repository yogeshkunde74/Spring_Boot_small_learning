package com.thymeleaf.tutorial.Controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

// import ch.qos.logback.core.model.Model;


@Controller
public class UserController {

    @GetMapping("/show")
    public String show(Model model){
        String channel = "Admin";
        model.addAttribute("name", channel);
        return "show";
    }
}
