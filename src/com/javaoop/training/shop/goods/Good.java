package com.javaoop.training.shop.goods;

import com.javaoop.training.shop.department.Department;

public class Good {
    private double price;
    private boolean hasGuarantee;
    private String name;
    private Department department;
    private String company;

    public Good() {
    }

    public Good(double price, boolean hasGuarantee, String name, Department department, String company) {
        this.price = price;
        this.hasGuarantee = hasGuarantee;
        this.name = name;
        this.department = department;
        this.company = company;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isHasGuarantee() {
        return hasGuarantee;
    }

    public void setHasGuarantee(boolean hasGuarantee) {
        this.hasGuarantee = hasGuarantee;
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
