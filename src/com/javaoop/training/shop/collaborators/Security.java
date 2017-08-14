package com.javaoop.training.shop.collaborators;

import com.javaoop.training.shop.department.Department;

public class Security extends Employee {

    public Security() {
    }

    public Security(String name, Department department, boolean isFree) {
        super(name, department, isFree);
    }

    public void checkVisitor(){

    }

    public void openDoor(){

    }

    public void closeDoor(){

    }

    @Override
    public String toString() {
        return "Security{" +
                "name='" + super.getName() + '\'' +
                ", department=" + super.getDepartment() +
                ", isFree=" + super.isFree() +
                '}';
    }
}
