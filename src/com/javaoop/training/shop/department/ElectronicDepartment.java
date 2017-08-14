package com.javaoop.training.shop.department;

import com.javaoop.training.shop.collaborators.Employee;
import com.javaoop.training.shop.goods.Good;

import java.util.ArrayList;

public class ElectronicDepartment extends Department{

    public ElectronicDepartment() {
    }

    public ElectronicDepartment(String name, ArrayList<Employee> employeeArrayList, ArrayList<Good> goodArrayList) {
        super(name, employeeArrayList, goodArrayList);
    }
}
