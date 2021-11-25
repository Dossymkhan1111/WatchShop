package com.company.Factory;


import com.company.Bridge.Color;

public class Tissot extends Watch {

    public void getWatch() {
        System.out.println("Tissot");
    }

    public String toColor() {
        return color.toColor();
    }

    public double getPrice() {
        return 4500;
    }

    public Tissot(Color toColor) {
        super(toColor);
    }

    public Tissot() {
    }
}
