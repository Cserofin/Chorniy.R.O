package model;

public class Людина {
    private String ім_я;
    private String прізвище;
    private String побатькові;
    private Стать стать;

    public Людина(String ім_я, String прізвище, String побатькові, Стать стать) {
        this.ім_я = ім_я;
        this.прізвище = прізвище;
        this.побатькові = побатькові;
        this.стать = стать;
    }


}