package com.javaoop.training.shop.goods;

import com.javaoop.training.shop.department.Department;

public class ElectronicDevice extends Good {

    public ElectronicDevice() {
    }

    public ElectronicDevice(double price, boolean hasGuarantee, String name, Department department, String company) {
        super(price, hasGuarantee, name, department, company);
    }

    public void on(){

    }

    public void off(){

    }
}
