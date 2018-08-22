package pl.superfarmer.game.superfarmer.domain;

public class DiceThrowResult {

    private String redField;
    private String greenField;


    public String getRedField() {
        return redField;
    }

    public String getGreenField() {
        return greenField;
    }

    public void setRedField(String redField) {
        this.redField = redField;
    }


    @Override
    public String toString() {
        return "Wynik zielonej kostki : " + getRedField() + "/nWynik czerwonej kostki : " + getGreenField();

    }

    public void setGreenField(String greenField) {
        this.greenField = greenField;
    }
}
