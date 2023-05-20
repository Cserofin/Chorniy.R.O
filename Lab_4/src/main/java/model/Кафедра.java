package model;

import java.util.ArrayList;
import java.util.List;

public class Кафедра {
    private String назва;
    private List<Група> групи;

    public Кафедра(String назва) {
        this.назва = назва;
        this.групи = new ArrayList<>();
    }

    public void додатиГрупу(Група група) {
        групи.add(група);
    }


}