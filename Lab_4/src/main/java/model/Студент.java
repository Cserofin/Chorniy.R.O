package model;
import java.util.Objects;
public class Студент extends Людина {
    private Група група;

    public Студент(String ім_я, String прізвище, String побатькові, Стать стать) {
            super(ім_я, прізвище, побатькові, стать);
}

    public void встановитиГрупу(Група група) {
        this.група = група;
    }


}