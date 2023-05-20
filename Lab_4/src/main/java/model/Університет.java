package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


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



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Університет other = (Університет) obj;

        return Objects.equals(назва, other.назва) &&
                Objects.equals(факультети, other.факультети);
    }

    @Override
    public int hashCode() {
        return Objects.hash(назва, факультети);
    }
}