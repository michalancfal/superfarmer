package pl.superfarmer.game.superfarmer.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.superfarmer.game.superfarmer.domain.DiceThrowResult;
import pl.superfarmer.game.superfarmer.domain.Farm;

@Controller
public class SuperFarmerController {


    @GetMapping("/hello")
    public String greetings(Model model) {

        model.addAttribute("hello");
        return "hello";

    }

    @ResponseBody
    @GetMapping("/throwDices")
    public DiceThrowResult diceResult(Model model) {
        Farm f = new Farm();
        DiceThrowResult diceThrowResult = f.throwDices();

        model.addAttribute("diceResult", diceThrowResult);


        return diceThrowResult;
    }
}
