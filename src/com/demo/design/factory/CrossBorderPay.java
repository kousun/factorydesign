package com.demo.design.factory;

import java.math.BigDecimal;

public interface CrossBorderPay {
    void pay(BigDecimal amount);
    void transfer(String from, String to, BigDecimal amount);
}
