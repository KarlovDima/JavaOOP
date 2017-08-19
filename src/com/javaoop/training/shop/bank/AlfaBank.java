package com.javaoop.training.shop.bank;

public class AlfaBank extends AbstractBank {

    public AlfaBank() {
    }

    public AlfaBank(String name, String creditDescription) {
        super(name, creditDescription);
    }

    @Override
    public String toString() {
        return "AlfaBank{" +
                "name='" + super.getName() + '\'' +
                ", creditDescription='" + super.getCreditDescription() + '\'' +
                '}';
    }


}
