package com.javaoop.training.shop.client;

public class CommonVisitor extends Visitor {

    public CommonVisitor() {
    }

    public CommonVisitor(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "CommonVisitor{" +
                "name='" + super.getName() + '\'' +
                '}';
    }
}
