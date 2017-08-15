package com.javaoop.training.shop.department;

import com.javaoop.training.shop.interfaces.DepartmentInterface;
import com.javaoop.training.shop.interfaces.EmployeeInterface;
import com.javaoop.training.shop.interfaces.GoodInterface;

import java.util.ArrayList;

public class Department implements DepartmentInterface {

    private String name;
    private ArrayList<EmployeeInterface> employeeArrayList;
    private ArrayList<GoodInterface> goodArrayList;

    public Department() {
    }

    public Department(String name, ArrayList<EmployeeInterface> employeeArrayList, ArrayList<GoodInterface> goodArrayList) {
        this.name = name;
        this.employeeArrayList = employeeArrayList;
        this.goodArrayList = goodArrayList;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public ArrayList<EmployeeInterface> getEmployeeArrayList() {
        return employeeArrayList;
    }

    @Override
    public ArrayList<GoodInterface> getGoodsArrayList() {
        return goodArrayList;
    }
}
