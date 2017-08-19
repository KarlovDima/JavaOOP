package com.javaoop.training.shop.bank;

import com.javaoop.training.shop.interfaces.BankInterface;

public abstract class AbstractBank implements BankInterface{
    private String name;
    private String creditDescription;

    public AbstractBank() {
    }

    public AbstractBank(String name, String creditDescription) {
        this.name = name;
        this.creditDescription = creditDescription;
    }


    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getCreditDescription() {
        return creditDescription;
    }

    public void setCreditDescription(String creditDescription) {
        this.creditDescription = creditDescription;
    }

    @Override
    public void checkInformation() {

    }

    @Override
    public void giveCredit() {

    }

    @Override
    public String toString() {
        return "AbstractBank{" +
                "name='" + name + '\'' +
                ", creditDescription='" + creditDescription + '\'' +
                '}';
    }
}
