package com.demo.design.factory;

public class UnipayFactory implements IFactory {
    @Override
    public InlandPay createInland() {
        return new InlandUnipay();
    }

    @Override
    public CrossBorderPay createCrossBorder() {
        return new CrossBorderUnipay();
    }
}
