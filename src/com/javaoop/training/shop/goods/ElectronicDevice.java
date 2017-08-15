package com.javaoop.training.shop.goods;

import com.javaoop.training.shop.interfaces.DepartmentInterface;
import com.javaoop.training.shop.interfaces.ElectronicDeviceInterface;

public class ElectronicDevice extends Good implements ElectronicDeviceInterface{

    public ElectronicDevice() {
    }

    public ElectronicDevice(double price, boolean hasGuarantee, String name, DepartmentInterface department, String company) {
        super(price, hasGuarantee, name, department, company);
    }

    public void on(){

    }

    public void off(){

    }
}
