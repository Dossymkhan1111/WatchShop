package com.company.Factory;

public class RolexFactory implements WatchFactory {
    @Override
    public Watch build() {
        return new Rolex ();
    }
}
