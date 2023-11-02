package br.com.pyetro;

public class TeslaModelS extends Car {
    @Override
    protected void sizeDimensions() {
        System.out.println("Model S size");
    }

    @Override
    protected void fuelConsumption() {
        System.out.println("Model s fuel consumption");
    }

    @Override
    protected void engineSpecs() {
        System.out.println("Model s engine specs");
    }
}
