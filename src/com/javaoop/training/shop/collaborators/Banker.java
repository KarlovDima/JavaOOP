package com.javaoop.training.shop.collaborators;

import com.javaoop.training.shop.bank.Bank;
import com.javaoop.training.shop.interfaces.BankInterface;
import com.javaoop.training.shop.interfaces.DepartmentInterface;

public class Banker extends Employee {
    private BankInterface bank;

    public Banker(Bank bank) {
        this.bank = bank;
    }

    public Banker(String name, DepartmentInterface department, boolean isFree, Bank bank) {
        super(name, department, isFree);
        this.bank = bank;
    }

    public BankInterface getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
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
