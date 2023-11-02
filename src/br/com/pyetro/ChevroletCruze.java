package br.com.pyetro;

public class ChevroletCruze extends Car {
    @Override
    protected void sizeDimensions() {
        System.out.println("Cruze size dimensions");
    }

    @Override
    protected void fuelConsumption() {
        System.out.println("Cruze fuel consumption");
    }

    @Override
    protected void engineSpecs() {
        System.out.println("Cruze engine specs");
    }
}
