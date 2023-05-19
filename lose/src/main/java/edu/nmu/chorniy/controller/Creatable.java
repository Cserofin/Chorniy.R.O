package edu.nmu.chorniy.controller;

import edu.nmu.chorniy.model.Entity;

public interface Creatable {
    Entity create();
    Entity createRandomly();
}