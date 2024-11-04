package za.co.protogen.core.impl;

import za.co.protogen.core.CarService;
import za.co.protogen.domain.Car;
import za.co.protogen.utility.Constant;

import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    @Override
    public void addCar(Car car) {
        Constant.cars.add(car);
    }

    @Override
    public void removeCar(String vin) {
        Constant.cars.removeIf(car -> car.getVin().equals(vin));
    }

    @Override
    public Car getCarById(String vin) {
        return Constant.cars.stream().filter(car -> car.getVin().equals(vin)).findFirst().orElse(null);
    }

    @Override
    public List<Car> getAllCars() {
        return Constant.cars;
    }

    @Override
    public List<Car> getCarsByMake(String make) {
        return Constant.cars.stream().filter(car -> car.getMake().equalsIgnoreCase(make)).collect(Collectors.toList());
    }

    @Override
    public List<Car> getCarsByYear(int year) {
        return Constant.cars.stream().filter(car -> car.getYear() == year).collect(Collectors.toList());
    }

    @Override
    public List<Car> getCarsByColor(String color) {
        return Constant.cars.stream().filter(car -> car.getColor().equalsIgnoreCase(color)).collect(Collectors.toList());
    }

    @Override
    public void updateCar(Car car) {
        Car existingCar = getCarById(car.getVin());
        if (existingCar != null) {
            Constant.cars.remove(existingCar);
            Constant.cars.add(car);
        }
    }

    @Override
    public double calculateAverageMileage() {
        return Constant.cars.stream().mapToInt(Car::getMileage).average().orElse(0);
    }

    @Override
    public Car findCheapestCar() {
        return Constant.cars.stream().min((c1, c2) -> Double.compare(c1.getPrice(), c2.getPrice())).orElse(null);
    }

    @Override
    public Car findMostExpensiveCar() {
        return Constant.cars.stream().max((c1, c2) -> Double.compare(c1.getPrice(), c2.getPrice())).orElse(null);
    }

    @Override
    public Car findNewestCar() {
        return Constant.cars.stream().max((c1, c2) -> Integer.compare(c1.getYear(), c2.getYear())).orElse(null);
    }

    @Override
    public Car findOldestCar() {
        return Constant.cars.stream().min((c1, c2) -> Integer.compare(c1.getYear(), c2.getYear())).orElse(null);
    }

    @Override
    public List<Car> searchCars(String make, String model, double minPrice, double maxPrice) {
        return Constant.cars.stream()
                .filter(car -> car.getMake().equalsIgnoreCase(make) && car.getModel().equalsIgnoreCase(model) &&
                        car.getPrice() >= minPrice && car.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }
}
