package za.co.protogen.utility;

import za.co.protogen.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class Constant {
    public static List<Car> cars = new ArrayList<>();

    static {
        Car car1 = new Car();
        car1.setMake("Toyota");
        car1.setModel("Corolla");
        car1.setYear(2021);
        car1.setColor("White");
        car1.setEngine("1.8L");
        car1.setTransmission(String.valueOf(Car.Transmission.AUTOMATIC));
        car1.setFuelType(String.valueOf(Car.FuelType.GASOLINE));
        car1.setMileage(10000);
        car1.setVin("ABC123");
        car1.setPrice(25000);
        car1.setOwnerId(123);
        car1.setFeatures(new ArrayList<>());
        cars.add(car1);

        Car car2 = new Car();
        car2.setMake("Honda");
        car2.setModel("Civic");
        car2.setYear(2020);
        car2.setColor("Red");
        car2.setEngine("1.5L");
        car2.setTransmission(String.valueOf(Car.Transmission.CVT));
        car2.setFuelType(String.valueOf(Car.FuelType.GASOLINE));
        car2.setMileage(15000);
        car2.setVin("XYZ789");
        car2.setPrice(22000);
        car2.setOwnerId(456);
        car2.setFeatures(new ArrayList<>());
        cars.add(car2);

        Car car3 = new Car();
        car2.setMake("Ford");
        car2.setModel("Fiesta");
        car2.setYear(2024);
        car2.setColor("White");
        car2.setEngine("1.2L");
        car2.setTransmission(String.valueOf(Car.Transmission.CVT));
        car2.setFuelType(String.valueOf(Car.FuelType.GASOLINE));
        car2.setMileage(10000);
        car2.setVin("AMX258");
        car2.setPrice(22000);
        car2.setOwnerId(456);
        car2.setFeatures(new ArrayList<>());
        cars.add(car3);

        Car car4 = new Car();
        car2.setMake("Honda");
        car2.setModel("Civic");
        car2.setYear(2020);
        car2.setColor("Red");
        car2.setEngine("1.5L");
        car2.setTransmission(String.valueOf(Car.Transmission.CVT));
        car2.setFuelType(String.valueOf(Car.FuelType.GASOLINE));
        car2.setMileage(15000);
        car2.setVin("XYZ789");
        car2.setPrice(22000);
        car2.setOwnerId(456);
        car2.setFeatures(new ArrayList<>());
        cars.add(car4);
    }
}
