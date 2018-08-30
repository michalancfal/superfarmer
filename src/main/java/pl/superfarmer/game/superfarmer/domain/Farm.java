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

    public int getTempWolves() {
        return tempWolves;
    }

    public int getTempFoxes() {
        return tempFoxes;
    }

    public void setTempWolves(int tempWolves) {
        this.tempWolves = tempWolves;
    }

    public void setTempFoxes(int tempFoxes) {
        this.tempFoxes = tempFoxes;
    }

    int tempRabbits = 0;
    int tempSheep = 0;
    int tempPigs = 0;
    int tempCows = 0;
    int tempHorses = 0;
    int tempWolves = 0;
    int tempFoxes = 0;


    public void resetTemp() {

        this.setTempRabbits(0);
        this.setTempSheep(0);
        this.setTempPigs(0);
        this.setTempCows(0);
        this.setTempHorses(0);

    }

    @Override
    public void countDiceResultsOnFarm(DiceThrowResult diceThrowResult) {


        //Liczenie przyrostów dla użytkownika z wyniku kostki czerwonej : lis, koń, świnie, owce, królików


        switch (diceThrowResult.getRedField()) {

            case ("rabbit"): {
                setTempRabbits(getTempRabbits() + 1);
                break;
            }
            case ("sheep"): {
                setTempSheep(getTempSheep() + 1);
                break;
            }
            case ("pig"): {
                setTempPigs(getTempPigs() + 1);
                break;
            }
            case ("horse"): {
                setTempHorses(getTempHorses() + 1);
                break;
            }
            default: {
                System.out.println("nieprawidłowy rezultat");


            }
        }

        //Liczenie przyrostu dla użytkownika z wyniku rzutu kostki zieonej : wilk, krowa, świnia, owca, królik

        switch (diceThrowResult.getGreenField()) {

            case ("rabbit"): {
                setTempRabbits(getTempRabbits() + 1);
                break;
            }

            case ("sheep"): {
                setTempSheep(getTempSheep() + 1);
                break;
            }

            case ("pig"): {
                setTempPigs(getTempPigs() + 1);
                break;
            }
            case ("krowa"): {
                setTempCows(getTempCows() + 1);
                break;
            }
            case ("wilk"): {


                break;
            }
            default: {
                System.out.println("nieprawidłowy rezultat");

            }

        }


        if (tempRabbits > 0) {

            this.setRabbits((this.getRabbits() + tempRabbits) % 2);

        }

        if (tempSheep > 0) {
            this.setSheep((this.getSheep() + tempSheep) % 2);

        }
        if (tempPigs > 0) {
            this.setPigs((this.getPigs() + tempPigs) % 2);

        }
        if (tempCows > 0) {
            this.setCows((this.getCows() + tempCows) % 2);

        }
        if (tempHorses > 0) {
            this.setHorses((this.getHorses() + tempHorses) % 2);

        }

        if (tempFoxes > 0) {
            if (this.getSmallDogs() > 0) {
                this.setSmallDogs(this.getSmallDogs() - 1);

                System.out.println("");
            } else {
                this.setRabbits(0);
                System.out.println("zabrano wszystkie króliki");
            }

        }
        if (tempWolves > 0) {
            if (this.getBigDogs() > 0) {
                this.setBigDogs(this.getBigDogs() - 1);
            }

        }

    }

    @Override
    public String toString() {
        return "Farm{" +
                "rabbits=" + rabbits +
                ", sheep=" + sheep +
                ", pigs=" + pigs +
                ", cows=" + cows +
                ", horses=" + horses +
                ", smallDogs=" + smallDogs +
                ", bigDogs=" + bigDogs +
                '}';
    }

    public static void main(String[] args) {

        Farm farma = new Farm();
        farma.setRabbits(1);
        farma.setSheep(1);
        farma.setPigs(1);


        System.out.println(farma);
        farma.countDiceResultsOnFarm(farma.throwDices());
        System.out.println(farma);



    }




}