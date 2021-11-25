package com.company.Observer;

import com.company.Strategy.PaymentStrategy;

import java.util.ArrayList;

public class Client implements Observer{

    private String name;

    @Override
    public void update(ArrayList<Observer> o) {
        System.out.println(name + o);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    private PaymentStrategy strategy;

    public void pay(){
        strategy.pay();
    }

    public void setPayStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public Client(String name) {
        setName ( name );
    }

    @Override
    public String toString() {
        return "Customer{name='%s', payStrategy=%s}".formatted ( getName () , strategy );
    }
}
