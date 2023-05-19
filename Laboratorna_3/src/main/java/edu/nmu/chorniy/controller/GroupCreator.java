package edu.nmu.chorniy.controller;

import edu.nmu.chorniy.model.Group;

public class GroupCreator {
    public Group createGroup(String name) {
        return new Group(name);
    }
}