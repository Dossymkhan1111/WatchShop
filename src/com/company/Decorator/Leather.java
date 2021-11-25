package com.company.Decorator;

import com.company.Factory.Watch;

public class Leather extends WatchDecorator {

    public Leather(Watch watch) {
        super(watch);
    }


    @Override
    public String toColor() {
        return null;
    }
}
