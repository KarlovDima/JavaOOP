package com.javaoop.training.shop.department;

import com.javaoop.training.shop.interfaces.EmployeeInterface;
import com.javaoop.training.shop.interfaces.GoodInterface;

import java.util.ArrayList;

public class ElectronicDepartment extends AbstractDepartment {

    public ElectronicDepartment() {
    }

    public ElectronicDepartment(String name, ArrayList<EmployeeInterface> employeeArrayList, ArrayList<GoodInterface> goodArrayList) {
        super(name, employeeArrayList, goodArrayList);
    }
}
