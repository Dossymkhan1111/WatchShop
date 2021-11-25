package com.company.Factory;

public class TissotFactory implements WatchFactory {

    @Override
    public Watch build() {
        return new Tissot ();
    }
}
