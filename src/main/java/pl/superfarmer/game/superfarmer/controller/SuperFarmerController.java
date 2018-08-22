package pl.superfarmer.game.superfarmer.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SuperFarmerController {


    @GetMapping("/hello")
    public String greetings(Model model) {

        model.addAttribute("hello");
        return "hello";

    }
}
