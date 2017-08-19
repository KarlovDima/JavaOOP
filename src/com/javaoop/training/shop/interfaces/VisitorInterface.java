package com.javaoop.training.shop.interfaces;

public interface VisitorInterface {

    void buy(GoodInterface good);

    void returnGood(GoodInterface good);

    String getName();
}
