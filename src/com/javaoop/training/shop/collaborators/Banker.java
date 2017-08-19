package com.javaoop.training.shop.collaborators;

import com.javaoop.training.shop.bank.AbstractBank;
import com.javaoop.training.shop.interfaces.BankInterface;
import com.javaoop.training.shop.interfaces.DepartmentInterface;

public class Banker extends AbstractEmployee {
    private BankInterface bank;

    public Banker(BankInterface bank) {
        this.bank = bank;
    }

    public Banker(String name, DepartmentInterface department, boolean isFree, AbstractBank bank) {
        super(name, department, isFree);
        this.bank = bank;
    }

    public BankInterface getBank() {
        return bank;
    }

    public void setBank(AbstractBank bank) {
        this.bank = bank;
    }

    public void sendRequest(){

    }

    @Override
    public String toString() {
        return "Banker{" +
                "name='" + super.getName() + '\'' +
                ", department=" + super.getDepartment() +
                ", isFree=" + super.isFree() +
                "bank=" + bank +
                '}';
    }
}
