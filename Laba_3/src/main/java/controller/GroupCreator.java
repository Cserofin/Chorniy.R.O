package controller;

import model.Група;

public class GroupCreator {
    public Група створитиГрупу(String назва) {
        return new Група(назва);
    }
}