package com.javaoop.training.shop.bank;

public class Bank {
    private String name;
    private String creditDescription;

    public Bank() {
    }

    public Bank(String name, String creditDescription) {
        this.name = name;
        this.creditDescription = creditDescription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreditDescription() {
        return creditDescription;
    }

    public void setCreditDescription(String creditDescription) {
        this.creditDescription = creditDescription;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", creditDescription='" + creditDescription + '\'' +
                '}';
    }
}
