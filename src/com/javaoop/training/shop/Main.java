package com.javaoop.training.shop;

import com.javaoop.training.shop.client.CommonVisitor;
import com.javaoop.training.shop.goods.Computer;
import com.javaoop.training.shop.goods.GameConsole;

public class Main {
    public static void main(String[] args) {
        Computer computer=new Computer("Apple");
        GameConsole gameConsole = new GameConsole("PSP");

        CommonVisitor visitor = new CommonVisitor();

        visitor.buy(computer);
        visitor.buy(gameConsole);

    }
}
