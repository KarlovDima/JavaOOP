package com.javaoop.training.shop.bank;

import com.javaoop.training.shop.interfaces.BankInterface;

public class Bank implements BankInterface{
    private String name;
    private String creditDescription;

    public Bank() {
    }

    public Bank(String name, String creditDescription) {
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
        return "Bank{" +
                "name='" + name + '\'' +
                ", creditDescription='" + creditDescription + '\'' +
                '}';
    }
}
