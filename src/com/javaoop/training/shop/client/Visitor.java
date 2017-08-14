package com.javaoop.training.shop.client;

public class Visitor {
    private String name;

    public Visitor() {

    }

    public Visitor(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void buy(){

    }

    @Override
    public String toString() {
        return "Visitor{" +
                "name='" + name + '\'' +
                '}';
    }
}
