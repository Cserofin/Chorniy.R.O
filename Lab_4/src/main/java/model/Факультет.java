package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import model.Група;

public class Факультет {
    private String назва;
    private List<Кафедра> кафедри;
    private Object групи;

    public Факультет(String назва) {
        this.назва = назва;
        this.кафедри = new ArrayList<>();
    }

    public void додатиКафедру(Кафедра кафедра) {
        кафедри.add(кафедра);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Факультет other = (Факультет) obj;

        return Objects.equals(назва, other.назва) &&
                Objects.equals(групи, other.групи);
    }

    @Override
    public int hashCode() {
        return Objects.hash(назва, групи);
    }
}