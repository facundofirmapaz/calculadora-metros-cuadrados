package com.calculadorametroscuadrados.calculadorametroscuadrados.entities;

public class Price
{
    private String location;
    private double price;

    public Price(String location, double price) {
        this.location = location;
        this.price = price;
    }

    public Price() {};

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
