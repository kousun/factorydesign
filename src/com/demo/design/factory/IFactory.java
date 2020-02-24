package com.demo.design.factory;

public interface IFactory {

    InlandPay createInland();

    CrossBorderPay createCrossBorder();
}
