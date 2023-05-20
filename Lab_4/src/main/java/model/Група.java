package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Група {
    private String назва;
    private List<Студент> студенти;

    public Група(String назва) {
        this.назва = назва;
        this.студенти = new ArrayList<>();
    }

    public void додатиСтудента(Студент студент) {
        студенти.add(студент);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Група other = (Група) obj;

        return Objects.equals(назва, other.назва) &&
                Objects.equals(студенти, other.студенти);
    }

    @Override
    public int hashCode() {
        return Objects.hash(назва, студенти);
    }
}
