package com.company.Decorator;

import com.company.Factory.Watch;

public abstract class WatchDecorator extends Watch {
    private Watch watch;

    public WatchDecorator(Watch watch) {
        setWatch ( watch );
    }

    public void getWatch() {
    }

    public void setWatch(Watch watch) {
        this.watch = watch;
    }

    @Override
    public double getPrice() {
        return watch.getPrice();
    }
}
