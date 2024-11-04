package za.co.protogen;

import za.co.protogen.core.impl.CarServiceImpl;

public class Application {
    public static void main(String[] args) {
        CarServiceImpl carService = new CarServiceImpl();

        // Example usage
        System.out.println("All cars: " + carService.getAllCars());
    }
}