package com.javaoop.training.shop.department;

import com.javaoop.training.shop.collaborators.Employee;
import com.javaoop.training.shop.goods.Good;

import java.util.ArrayList;

public class EntertainmentDepartment extends Department{

    public EntertainmentDepartment() {
    }

    public EntertainmentDepartment(String name, ArrayList<Employee> employeeArrayList, ArrayList<Good> goodArrayList) {
        super(name, employeeArrayList, goodArrayList);
    }
}
