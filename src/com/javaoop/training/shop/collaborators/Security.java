package com.javaoop.training.shop.collaborators;

import com.javaoop.training.shop.interfaces.DepartmentInterface;

public class Security extends AbstractEmployee {

    public Security() {
    }

    public Security(String name, DepartmentInterface department, boolean isFree) {
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
