package model;

import java.util.ArrayList;
import java.util.List;

public class Університет {
    private String назва;
    private List<Факультет> факультети;

    public Університет(String назва) {
        this.назва = назва;
        this.факультети = new ArrayList<>();
    }

    public void додатиФакультет(Факультет факультет) {
        факультети.add(факультет);
    }

    // Додаткові методи та геттери/сеттери
}