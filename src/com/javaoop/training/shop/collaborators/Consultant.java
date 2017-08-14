package com.javaoop.training.shop.collaborators;

import com.javaoop.training.shop.department.Department;

public class Consultant extends Employee {

    public Consultant() {
    }

    public Consultant(String name, Department department, boolean isFree) {
        super(name, department, isFree);
    }

    @Override
    public String toString() {
        return "Consultant{" +
                "name='" + super.getName() + '\'' +
                ", department=" + super.getDepartment() +
                ", isFree=" + super.isFree() +
                '}';
    }
}
