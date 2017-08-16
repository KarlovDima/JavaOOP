package com.javaoop.training.shop.collaborators;

import com.javaoop.training.shop.interfaces.DepartmentInterface;
import com.javaoop.training.shop.interfaces.EmployeeInterface;

public abstract class Employee implements EmployeeInterface{
    private  String name;
    private DepartmentInterface department;
    private boolean isFree;

    public Employee() {
    }

    public Employee(String name, DepartmentInterface department, boolean isFree) {
        this.name = name;
        this.department = department;
        this.isFree = isFree;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public DepartmentInterface getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentInterface department) {
        this.department = department;
    }

    @Override
    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department=" + department +
                ", isFree=" + isFree +
                '}';
    }
}
