package com.demo.design.factory;

import java.math.BigDecimal;

public class CrossBorderWepay implements CrossBorderPay {
    @Override
    public void pay(BigDecimal amount) {
        //TODO
    }

    @Override
    public void transfer(String from, String to, BigDecimal amount) {

    }
}
