package com.javaoop.training.shop.goods;

import com.javaoop.training.shop.interfaces.DepartmentInterface;
import com.javaoop.training.shop.interfaces.GoodInterface;

public abstract class Good implements GoodInterface{
    private double price;
    private boolean hasGuarantee;
    private String name;
    private DepartmentInterface department;
    private String company;

    public Good() {
    }

    public Good(double price, boolean hasGuarantee, String name, DepartmentInterface department, String company) {
        this.price = price;
        this.hasGuarantee = hasGuarantee;
        this.name = name;
        this.department = department;
        this.company = company;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean hasGuarantee() {
        return hasGuarantee;
    }

    public void setHasGuarantee(boolean hasGuarantee) {
        this.hasGuarantee = hasGuarantee;
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
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Good{" +
                "price=" + price +
                ", hasGuarantee=" + hasGuarantee +
                ", name='" + name + '\'' +
                ", department=" + department +
                ", company='" + company + '\'' +
                '}';
    }
}
