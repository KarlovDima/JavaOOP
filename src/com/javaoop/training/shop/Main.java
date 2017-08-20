package com.javaoop.training.shop;

import com.javaoop.training.shop.client.CommonVisitor;
import com.javaoop.training.shop.goods.Computer;
import com.javaoop.training.shop.goods.GameConsole;
import com.javaoop.training.shop.interfaces.GoodInterface;
import com.javaoop.training.shop.interfaces.VisitorInterface;

public class Main {
    public static void main(String[] args) {
/*      Computer computer=new Computer("Apple");
        GameConsole gameConsole = new GameConsole("PSP");

        CommonVisitor visitor = new CommonVisitor();

        visitor.buy(computer);
        visitor.buy(gameConsole);*/

        GoodInterface good =new Computer("Apple");
        Computer computer = (Computer)good;

        good = new GameConsole("PSP");
        GameConsole gameConsole=(GameConsole) good;

        VisitorInterface visitorInterface=new CommonVisitor();

        visitorInterface.buy(computer);
        visitorInterface.buy(gameConsole);
    }
}
