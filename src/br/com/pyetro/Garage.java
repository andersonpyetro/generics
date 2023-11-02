package br.com.pyetro;
import java.util.ArrayList;
import java.util.List;
public class Garage {

    public static void main(String[] args){
        List<String> list = new ArrayList<>();

        List<Car> cars = new ArrayList<>();
        cars.add(new ChevroletCruze());
        cars.add(new HondaCivic());
        cars.add(new TeslaModelS());
        cars.add(new ToyotaHilux());
        printCars(cars);


    }

    private static void printCars(List<? extends Car> list) {
        for(Car car : list){
            System.out.println(car);
        }
    }
}
