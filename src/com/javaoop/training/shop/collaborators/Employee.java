package com.javaoop.training.shop.collaborators;

import com.javaoop.training.shop.department.Department;

public class Employee {
    private  String name;
    private Department department;
    private boolean isFree;

    public Employee() {
    }

    public Employee(String name, Department department, boolean isFree) {
        this.name = name;
        this.department = department;
        this.isFree = isFree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

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
