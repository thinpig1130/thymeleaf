package me.manylove.thymeleaf.web.controller;

import me.manylove.thymeleaf.business.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Calendar;

@Controller
@RequestMapping("/")
public class HomeController {


    @GetMapping
    public String home(Model model){
        model.addAttribute("user", new User("John", "Apricot", "Antarctica", null));
        model.addAttribute("today", Calendar.getInstance());
        return "home";
    }


}
