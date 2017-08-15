package com.javaoop.training.shop;

import com.javaoop.training.shop.collaborators.Administrator;
import com.javaoop.training.shop.interfaces.DepartmentInterface;
import com.javaoop.training.shop.interfaces.VisitorInterface;

import java.util.ArrayList;

public class SaleRoom {
    private ArrayList<DepartmentInterface> departmentArrayList;
    private String name;
    private ArrayList<VisitorInterface> visitorArrayList;
    private Administrator administrator;

    public SaleRoom() {
    }

    public SaleRoom(ArrayList<DepartmentInterface> departmentArrayList, String name, ArrayList<VisitorInterface> visitorArrayList, Administrator administrator) {
        this.departmentArrayList = departmentArrayList;
        this.name = name;
        this.visitorArrayList = visitorArrayList;
        this.administrator = administrator;
    }

    public ArrayList<DepartmentInterface> getDepartmentArrayList() {
        return departmentArrayList;
    }

    public void setDepartmentArrayList(ArrayList<DepartmentInterface> departmentArrayList) {
        this.departmentArrayList = departmentArrayList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<VisitorInterface> getVisitorArrayList() {
        return visitorArrayList;
    }

    public void setVisitorArrayList(ArrayList<VisitorInterface> visitorArrayList) {
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
