package com.demo.design.factory;

public class WepayFactory implements IFactory {
    @Override
    public InlandPay createInland() {
        return new InlandAlipay();
    }

    @Override
    public CrossBorderPay createCrossBorder() {
        return new CrossBorderAlipay();
    }
}
