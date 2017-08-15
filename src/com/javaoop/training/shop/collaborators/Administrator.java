package com.javaoop.training.shop.collaborators;

import com.javaoop.training.shop.interfaces.DepartmentInterface;

public class Administrator extends Employee {

    public Administrator() {
    }

    public Administrator(String name, DepartmentInterface department, boolean isFree) {
        super(name, department, isFree);
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "name='" + super.getName() + '\'' +
                ", department=" + super.getDepartment() +
                ", isFree=" + super.isFree() +
                '}';
    }
}
