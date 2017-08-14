package com.javaoop.training.shop.bank;

public class TinkoffBank extends Bank {

    public TinkoffBank() {
    }

    public TinkoffBank(String name, String creditDescription) {
        super(name, creditDescription);
    }

    @Override
    public String toString() {
        return "TinkoffBank{" +
                "name='" + super.getName() + '\'' +
                ", creditDescription='" + super.getCreditDescription() + '\'' +
                '}';
    }

}
