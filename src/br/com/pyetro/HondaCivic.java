package br.com.pyetro;

public class HondaCivic extends Car {
    @Override
    protected void sizeDimensions() {
        System.out.println("Civic size dimensions");
    }

    @Override
    protected void fuelConsumption() {
        System.out.println("Civic fuel consumption");
    }

    @Override
    protected void engineSpecs() {
        System.out.println("Civic engine specs");
    }
}
