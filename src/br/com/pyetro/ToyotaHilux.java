package br.com.pyetro;

public class ToyotaHilux extends Car {
    @Override
    protected void sizeDimensions() {
        System.out.println("Hilux size");
    }

    @Override
    protected void fuelConsumption() {
        System.out.println("Hilux fuel consumption");
    }

    @Override
    protected void engineSpecs() {
        System.out.println("Hilux engine specs");
    }
}
