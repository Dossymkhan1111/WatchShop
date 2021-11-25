package com.company.Strategy;

public class VISA implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("VISA.");
    }
}
