package controller;

import model.Група;
import model.Стать;
import model.Студент;

public class StudentCreator {
    public Студент створитиСтудента(String ім_я, String прізвище, String побатькові, Стать стать) {
        return new Студент(ім_я, прізвище, побатькові, стать);
    }

    public void призначитиСтудентаДоГрупи(Студент студент, Група група) {
        студент.встановитиГрупу(група);
    }
}
