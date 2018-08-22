package pl.superfarmer.game.superfarmer.domain;

import java.util.Random;

public interface Playable {

    static final int DICE_RANDOM_RANGE = 11;


    default DiceThrowResult throwDices() {

        DiceThrowResult diceThrowResult = new DiceThrowResult();
        Random r = new Random();


        //Poniżej instrukcja switch symulująca rzut kostki czerwonej o opisanym poniżej rozkładzie pól.
        //Kostka czerwona : lis, koń, 2 świnie, 2 owce, 6 królików.

        switch (r.nextInt()) {

            case 0: {
                diceThrowResult.setRedField("Wolf");
                break;
            }
            case 1: {
                diceThrowResult.setRedField("Wolf");
                break;
            }
            case 2: {
                diceThrowResult.setRedField("Wolf");
                break;
            }
            case 3: {
                diceThrowResult.setRedField("Wolf");
                break;

            }
            case 4: {
                diceThrowResult.setRedField("Wolf");
                break;
            }
            case 5: {
                diceThrowResult.setRedField("Wolf");
                break;
            }
            case 6: {
                diceThrowResult.setRedField("Wolf");
                break;
            }
            case 7: {
                diceThrowResult.setRedField("Wolf");
                break;
            }
            case 8: {
                diceThrowResult.setRedField("Wolf");
                break;
            }
            case 9: {
                diceThrowResult.setRedField("Wolf");
                break;
            }
            case 10: {
                diceThrowResult.setRedField("Wolf");
                break;
            }
            case 11: {
                diceThrowResult.setRedField("Wolf");
                break;
            }
            default: {
                diceThrowResult.setRedField("DEFAULT RED VALUE");
                break;
            }


        }



        //Poniżej instrukcja switch symulująca rzut kostki zielonej o opisanym poniżej rozkładzie pól.
        //Kostka zielona : wilk, krowa, świnia, 3 owce, 6 królików.

        switch (r.nextInt()) {

            case 0: {
                diceThrowResult.setGreenField("Green ");
                break;
            }
            case 1: {
                diceThrowResult.setGreenField("Green Wolf");
                break;
            }
            case 2: {
                diceThrowResult.setGreenField("Green Wolf");
                break;
            }
            case 3: {
                diceThrowResult.setGreenField("Green Wolf");
                break;

            }
            case 4: {
                diceThrowResult.setGreenField("Green Wolf");
                break;
            }
            case 5: {
                diceThrowResult.setGreenField("Green Wolf");
                break;
            }
            case 6: {
                diceThrowResult.setGreenField("Green Wolf");
                break;
            }
            case 7: {
                diceThrowResult.setGreenField("Green Wolf");
                break;
            }
            case 8: {
                diceThrowResult.setGreenField("Green Wolf");
                break;
            }
            case 9: {
                diceThrowResult.setGreenField("Green Wolf");
                break;
            }
            case 10: {
                diceThrowResult.setGreenField("Green Wolf");
                break;
            }
            case 11: {
                diceThrowResult.setGreenField("Green Wolf");
                break;
            }
            default: {
                diceThrowResult.setGreenField("DEFAULT GREEN VALUE");
                break;
            }


        }

        return diceThrowResult;

    }

    ;

}

