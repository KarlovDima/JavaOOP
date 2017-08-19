package com.javaoop.training.shop.client;

import com.javaoop.training.shop.interfaces.GoodInterface;

public class VipClient extends AbstractVisitor {
    private double discount;

    public VipClient() {
    }

    public VipClient(String name, double discount) {
        super(name);
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public void buy(GoodInterface good) {
        if (!checkDiscount())
            super.buy(good);
        else {

        }
    }

    private boolean checkDiscount() {
        return discount > 0;
    }

    @Override
    public String toString() {
        return "VipClient{" +
                "discount=" + discount +
                '}';
    }
}
