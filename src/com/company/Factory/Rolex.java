package com.company.Factory;



public class Rolex extends Watch {
    @Override
    public void getWatch() {
        System.out.println("Watch");
    }

    @Override
    public String toColor() {
        return color.toColor ();
    }

    @Override
    public double getPrice() {
        return 2800;
    }


    public Rolex() {
    }
}
