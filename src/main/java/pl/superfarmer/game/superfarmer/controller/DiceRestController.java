package pl.superfarmer.game.superfarmer.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.superfarmer.game.superfarmer.domain.DiceThrowResult;
import pl.superfarmer.game.superfarmer.domain.Farm;

@RestController
@RequestMapping("/api")
public class DiceRestController {


    @RequestMapping("/throwDiceRest")
    public DiceThrowResult throwDiceRest() {
        Farm farm = new Farm();
        DiceThrowResult diceThrowResult = new DiceThrowResult();
        diceThrowResult = farm.throwDices();

        return diceThrowResult;
    }

}



