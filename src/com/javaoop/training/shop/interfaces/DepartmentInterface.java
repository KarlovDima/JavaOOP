package com.javaoop.training.shop.interfaces;

import java.util.ArrayList;

public interface DepartmentInterface {

    String getName();

    ArrayList<EmployeeInterface> getEmployeeArrayList();

    ArrayList<GoodInterface> getGoodsArrayList();
}
