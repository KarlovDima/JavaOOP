package com.javaoop.training.shop.client;

import com.javaoop.training.shop.interfaces.VisitorInterface;

public class Visitor implements VisitorInterface {
    private String name;

    public Visitor() {

    }

    public Visitor(String name) {

        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void buy(){

    }

    @Override
    public void returnGood() {

    }

    @Override
    public String toString() {
        return "Visitor{" +
                "name='" + name + '\'' +
                '}';
    }
}
