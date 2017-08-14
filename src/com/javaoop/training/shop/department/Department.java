package com.javaoop.training.shop.department;

import com.javaoop.training.shop.collaborators.Employee;
import com.javaoop.training.shop.goods.Good;

import java.util.ArrayList;

public class Department {

    private String name;
    private ArrayList<Employee> employeeArrayList;
    private ArrayList<Good> goodArrayList;

    public Department() {
    }

    public Department(String name, ArrayList<Employee> employeeArrayList, ArrayList<Good> goodArrayList) {
        this.name = name;
        this.employeeArrayList = employeeArrayList;
        this.goodArrayList = goodArrayList;
    }
}
