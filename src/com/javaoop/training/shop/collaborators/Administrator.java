package com.javaoop.training.shop.collaborators;

import com.javaoop.training.shop.department.Department;

public class Administrator extends Employee {

    public Administrator() {
    }

    public Administrator(String name, Department department, boolean isFree) {
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
