package com.javaoop.training.shop.goods;

import com.javaoop.training.shop.department.Department;

public class Computer extends ElectronicDevice {
    private int ram;

    public Computer(int ram) {
        this.ram = ram;
    }

    public Computer(double price, boolean hasGuarantee, String name, Department department, String company, int ram) {
        super(price, hasGuarantee, name, department, company);
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    private void loadOS(){

    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                '}';
    }
}

