package pl.superfarmer.game.superfarmer.domain;

import java.util.Random;


public class Farm implements Playable {

    private int rabbits;
    private int sheep;
    private int pigs;
    private int cows;
    private int horses;
    private int smallDogs;
    private int bigDogs;


    public void setRabbits(int rabbits) {
        this.rabbits = rabbits;
    }

    public void setSheep(int sheep) {
        this.sheep = sheep;
    }

    public void setPigs(int pigs) {
        this.pigs = pigs;
    }

    public void setCows(int cows) {
        this.cows = cows;
    }

    public void setHorses(int horses) {
        this.horses = horses;
    }

    public void setSmallDogs(int smallDogs) {
        this.smallDogs = smallDogs;
    }

    public void setBigDogs(int bigDogs) {
        this.bigDogs = bigDogs;
    }

    public void setTempRabbits(int tempRabbits) {
        this.tempRabbits = tempRabbits;
    }

    public void setTempSheep(int tempSheep) {
        this.tempSheep = tempSheep;
    }

    public void setTempPigs(int tempPigs) {
        this.tempPigs = tempPigs;
    }

    public void setTempCows(int tempCows) {
        this.tempCows = tempCows;
    }

    public void setTempHorses(int tempHorses) {
        this.tempHorses = tempHorses;
    }

    public int getTempRabbits() {
        return tempRabbits;
    }

    public int getTempSheep() {
        return tempSheep;
    }

    public int getTempPigs() {
        return tempPigs;
    }

    public int getTempCows() {
        return tempCows;
    }

    public int getTempHorses() {
        return tempHorses;
    }

    public int getRabbits() {
        return rabbits;
    }

    public int getSheep() {
        return sheep;
    }

    public int getPigs() {
        return pigs;
    }

    public int getCows() {
        return cows;
    }

    public int getHorses() {
        return horses;
    }

    public int getSmallDogs() {
        return smallDogs;
    }

    public int getBigDogs() {
        return bigDogs;
    }

    int tempRabbits = 0;
    int tempSheep = 0;
    int tempPigs = 0;
    int tempCows = 0;
    int tempHorses = 0;

    @Override
    public void countDiceResultsOnFarm(DiceThrowResult diceThrowResult) {


        //Liczenie wyników dla użytkownika z wyniku kostki czerwonej : lis, koń, 2 świnie, 2 owce, 6 królików


        switch (diceThrowResult.getRedField()) {

            case ("rabbit"): {

                setTempRabbits(1 + this.getRabbits());

                break;

            }
            case ("sheep"): {

                setTempSheep(1 + this.getSheep());

                break;

            }
            case ("pig"): {

                setTempPigs(1 + this.getPigs());

                break;

            }
            case ("horse"): {

                setTempHorses(1 + this.getHorses());

                break;

            }
            case ("fox"): {


                break;

            }
            default: {
                System.out.println("Wynik kostki dał nieprawidłowy rezultat");

            }
        }

    }
}