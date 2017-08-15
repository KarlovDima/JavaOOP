package com.javaoop.training.shop.goods;

import com.javaoop.training.shop.interfaces.DepartmentInterface;

public class GameConsole extends ElectronicDevice {
    private int ram;

    public GameConsole(int ram) {
        this.ram = ram;
    }

    public GameConsole(double price, boolean hasGuarantee, String name, DepartmentInterface department, String company, int ram) {
        super(price, hasGuarantee, name, department, company);
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void loadGame() {

    }

    @Override
    public String toString() {
        return "GameConsole{" +
                "ram=" + ram +
                '}';
    }
}
