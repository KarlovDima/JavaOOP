package com.javaoop.training.shop.client;

public class CommonVisitor extends AbstractVisitor {

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
