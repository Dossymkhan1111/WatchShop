package com.company.Observer;

import java.util.ArrayList;

public class Shop implements Observable{

    private final ArrayList<Observer> client = new ArrayList<>();

    @Override
    public void add(Observer customer) {
        this.client.add(customer);
        notify(client);
    }

    private void notify(ArrayList<Observer> watch){
        this.client.forEach ( watches -> watches.update ( watch ) );
    }
}
