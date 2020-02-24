package com.demo.design.factory;

public class AlipayFactory implements IFactory {
    @Override
    public InlandPay createInland() {
        return new InlandWepay();
    }

    @Override
    public CrossBorderPay createCrossBorder() {
        return new CrossBorderWepay();
    }
}
