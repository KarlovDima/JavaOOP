package com.javaoop.training.shop.client;

import com.javaoop.training.shop.interfaces.GoodInterface;
import com.javaoop.training.shop.interfaces.VisitorInterface;

public abstract class AbstractVisitor implements VisitorInterface {
    private String name;

    public AbstractVisitor() {

    }

    public AbstractVisitor(String name) {

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
    public void buy(GoodInterface good){
        System.out.println(good.getName());
    }

    @Override
    public void returnGood(GoodInterface good) {

    }

    @Override
    public String toString() {
        return "AbstractVisitor{" +
                "name='" + name + '\'' +
                '}';
    }
}
