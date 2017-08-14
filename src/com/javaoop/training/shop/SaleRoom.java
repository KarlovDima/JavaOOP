package com.javaoop.training.shop;

import com.javaoop.training.shop.client.Visitor;
import com.javaoop.training.shop.collaborators.Administrator;
import com.javaoop.training.shop.department.Department;

import java.util.ArrayList;

public class SaleRoom {
    private ArrayList<Department> departmentArrayList;
    private String name;
    private ArrayList<Visitor> visitorArrayList;
    private Administrator administrator;

    public SaleRoom() {
    }

    public SaleRoom(ArrayList<Department> departmentArrayList, String name, ArrayList<Visitor> visitorArrayList, Administrator administrator) {
        this.departmentArrayList = departmentArrayList;
        this.name = name;
        this.visitorArrayList = visitorArrayList;
        this.administrator = administrator;
    }

    public ArrayList<Department> getDepartmentArrayList() {
        return departmentArrayList;
    }

    public void setDepartmentArrayList(ArrayList<Department> departmentArrayList) {
        this.departmentArrayList = departmentArrayList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Visitor> getVisitorArrayList() {
        return visitorArrayList;
    }

    public void setVisitorArrayList(ArrayList<Visitor> visitorArrayList) {
        this.visitorArrayList = visitorArrayList;
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }

    @Override
    public String toString() {
        return "SaleRoom{" +
                "departmentArrayList=" + departmentArrayList +
                ", name='" + name + '\'' +
                ", visitorArrayList=" + visitorArrayList +
                ", administrator=" + administrator +
                '}';
    }
}
