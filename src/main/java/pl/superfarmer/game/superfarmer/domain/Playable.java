package pl.superfarmer.game.superfarmer.domain;

import java.util.Random;

public interface Playable {


    //
    static final int DICE_RANDOM_RANGE = 11;



    default void countAnimalsFromDiceResult(DiceThrowResult diceThrowResult) {


    }

    default DiceThrowResult throwDices() {

        DiceThrowResult diceThrowResult = new DiceThrowResult();
        Random r = new Random();


        //Poniżej instrukcja switch symulująca rzut kostki czerwonej o opisanym poniżej rozkładzie pól.
        //Kostka czerwona : lis, koń, 2 świnie, 2 owce, 6 królików.

        switch (r.nextInt(DICE_RANDOM_RANGE)) {

            case 0: {
                diceThrowResult.setRedField("fox");
                break;
            }
            case 1: {
                diceThrowResult.setRedField("horse");
                break;
            }
            case 2: {
                diceThrowResult.setRedField("pig");
                break;
            }
            case 3: {
                diceThrowResult.setRedField("pig");
                break;

            }
            case 4: {
                diceThrowResult.setRedField("sheep");
                break;
            }
            case 5: {
                diceThrowResult.setRedField("sheep");
                break;
            }
            case 6: {
                diceThrowResult.setRedField("rabbit");
                break;
            }
            case 7: {
                diceThrowResult.setRedField("rabbit");
                break;
            }
            case 8: {
                diceThrowResult.setRedField("rabbit");
                break;
            }
            case 9: {
                diceThrowResult.setRedField("rabbit");
                break;
            }
            case 10: {
                diceThrowResult.setRedField("rabbit");
                break;
            }
            case 11: {
                diceThrowResult.setRedField("rabbit");
                break;
            }
            default: {
                diceThrowResult.setRedField("DEFAULT RED VALUE");
                break;
            }
        }


        //Poniżej instrukcja switch symulująca rzut kostki zielonej o opisanym poniżej rozkładzie pól.
        //Kostka zielona : wilk, krowa, świnia, 3 owce, 6 królików.

        switch (r.nextInt(DICE_RANDOM_RANGE)) {

            case 0: {
                diceThrowResult.setGreenField("wolf");
                break;
            }
            case 1: {
                diceThrowResult.setGreenField("cow");
                break;
            }
            case 2: {
                diceThrowResult.setGreenField("pig");
                break;
            }
            case 3: {
                diceThrowResult.setGreenField("sheep");
                break;

            }
            case 4: {
                diceThrowResult.setGreenField("sheep");
                break;
            }
            case 5: {
                diceThrowResult.setGreenField("sheep");
                break;
            }
            case 6: {
                diceThrowResult.setGreenField("rabbit");
                break;
            }
            case 7: {
                diceThrowResult.setGreenField("rabbit");
                break;
            }
            case 8: {
                diceThrowResult.setGreenField("rabbit");
                break;
            }
            case 9: {
                diceThrowResult.setGreenField("rabbit");
                break;
            }
            case 10: {
                diceThrowResult.setGreenField("rabbit");
                break;
            }
            case 11: {
                diceThrowResult.setGreenField("rabbit");
                break;
            }
            default: {
                diceThrowResult.setGreenField("DEFAULT GREEN VALUE");
                break;
            }


        }

        return diceThrowResult;

    }


    public void countDiceResultsOnFarm(DiceThrowResult diceThrowResult);








}

