package com.javaoop.training.shop.collaborators;

import com.javaoop.training.shop.bank.Bank;
import com.javaoop.training.shop.department.Department;

public class Banker extends Employee {
    private Bank bank;

    public Banker(Bank bank) {
        this.bank = bank;
    }

    public Banker(String name, Department department, boolean isFree, Bank bank) {
        super(name, department, isFree);
        this.bank = bank;
    }

    public Bank getBank() {
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
