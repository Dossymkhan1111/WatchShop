package com.company.Strategy;

public class MasterCard implements PaymentStrategy {
    public void pay() {
        System.out.println("MasterCard.");
    }


}
