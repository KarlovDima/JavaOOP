package com.javaoop.training.shop.collaborators;

import com.javaoop.training.shop.department.Department;

public class Cashier extends Employee{

    public Cashier() {
    }

    public Cashier(String name, Department department, boolean isFree) {
        super(name, department, isFree);
    }

    public void getMoney(){

    }

    public void giveBonusCard(){

    }

    @Override
    public String toString() {
        return "Cashier{" +
                "name='" + super.getName() + '\'' +
                ", department=" + super.getDepartment() +
                ", isFree=" + super.isFree() +
                '}';
    }
}
