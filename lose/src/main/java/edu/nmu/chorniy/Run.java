package edu.nmu.chorniy;

import edu.nmu.chorniy.controller.StructureCreator;
import edu.nmu.chorniy.controller.UniversityCreator;
import edu.nmu.chorniy.model.Structure;

public class Run {
    public static void main(String[] args) {

        System.out.println("Hello world! Beginning work");
        StructureCreator universityCreator = new UniversityCreator();
        Structure university = universityCreator.createRandomly();
        System.out.println(university);
    }
}
