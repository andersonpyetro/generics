package br.com.pyetro;

public abstract class Car {
    public void execute(){
        engineSpecs();
        fuelConsumption();
        sizeDimensions();
        vehicleMaintenance();
    }

    private void vehicleMaintenance() {
        System.out.println("Easy maintenance, you can choose a body shop of your preference.");
    }

    protected void sizeDimensions() {
        System.out.println("Lenght: 5m, Width: 2m, Height: 2m, Wheelbase:3m");
    }

    protected void fuelConsumption() {
        System.out.println("Fuel Consumption: 12.2 litres per 100km.");
    }

    protected void engineSpecs() {
        System.out.println("Type: 6L V-8 DI - Fuel Delivery: Direct high-pressure fuel injection. - Horsepower: 420.");
    }
}
