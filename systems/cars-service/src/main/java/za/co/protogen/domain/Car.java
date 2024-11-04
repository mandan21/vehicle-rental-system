package za.co.protogen.domain;

import java.util.List;

public class Car {
    // Enum definitions for Transmission and FuelType
    public enum Transmission { MANUAL, AUTOMATIC, CVT }
    public enum FuelType { GASOLINE, DIESEL, ELECTRIC }

    // Attributes
    private String make;
    private String model;
    private int year;
    private String color;
    private String engine;
    private Transmission transmission;
    private FuelType fuelType;
    private int mileage;
    private String vin;
    private double price;
    private int ownerId;
    private List<String> features;

    // Default constructor
    public Car() {
    }

    // Constructor with all fields
    public Car(String make, String model, int year, String color, String engine,
               Transmission transmission, FuelType fuelType, int mileage, String vin,
               double price, int ownerId, List<String> features) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engine = engine;
        this.transmission = transmission;
        this.fuelType = fuelType;
        this.mileage = mileage;
        this.vin = vin;
        this.price = price;
        this.ownerId = ownerId;
        this.features = features;
    }

    // Getters and setters for each field
    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getEngine() { return engine; }
    public void setEngine(String engine) { this.engine = engine; }

    public Transmission getTransmission() { return transmission; }
    public void setTransmission(String transmission) {
        // String-to-enum mapping for transmission
        if ("Automatic".equalsIgnoreCase(transmission)) {
            this.transmission = Transmission.AUTOMATIC;
        } else if ("CVT".equalsIgnoreCase(transmission)) {
            this.transmission = Transmission.CVT;
        } else {
            this.transmission = Transmission.MANUAL; // Default or handle accordingly
        }
    }

    public FuelType getFuelType() { return fuelType; }
    public void setFuelType(String fuelType) {
        // String-to-enum mapping for fuelType
        if ("Gasoline".equalsIgnoreCase(fuelType)) {
            this.fuelType = FuelType.GASOLINE;
        } else if ("Diesel".equalsIgnoreCase(fuelType)) {
            this.fuelType = FuelType.DIESEL;
        } else {
            this.fuelType = FuelType.ELECTRIC; // Default or handle accordingly
        }
    }

    public int getMileage() { return mileage; }
    public void setMileage(int mileage) { this.mileage = mileage; }

    public String getVin() { return vin; }
    public void setVin(String vin) { this.vin = vin; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getOwnerId() { return ownerId; }
    public void setOwnerId(int ownerId) { this.ownerId = ownerId; }

    public List<String> getFeatures() { return features; }
    public void setFeatures(List<String> features) { this.features = features; }

    // Overridden toString() method to display car details
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", transmission=" + transmission +
                ", fuelType=" + fuelType +
                ", mileage=" + mileage +
                ", vin='" + vin + '\'' +
                ", price=" + price +
                ", ownerId=" + ownerId +
                ", features=" + features +
                '}';
    }
}
