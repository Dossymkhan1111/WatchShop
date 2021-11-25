package com.company.Factory;

import com.company.Adapter.Price;
import com.company.Bridge.Color;

public abstract class Watch implements Price {
    Color color;

    public Watch(Color color) {
        setColor ( color );
    }

    public Watch() {
    }


    public void setColor(Color color) {
        this.color = color;
    }

    protected abstract void getWatch();
    abstract public String toColor();





}
