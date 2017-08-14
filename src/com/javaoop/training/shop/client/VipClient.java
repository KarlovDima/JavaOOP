package com.javaoop.training.shop.client;

public class VipClient extends Visitor {
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
    public void buy() {
        if (!checkDiscount())
            super.buy();
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
