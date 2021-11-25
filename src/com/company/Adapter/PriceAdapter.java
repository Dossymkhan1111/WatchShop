package com.company.Adapter;

public class PriceAdapter implements IPriceAdapter {

    public Price price;

    public PriceAdapter(Price price) {
        setPrice ( price );
    }

    private double convert(double dollar){
        return dollar * 1.7;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return convert(price.getPrice());
    }


}
