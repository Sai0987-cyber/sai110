// Abstract class
abstract class Vehicle {
    abstract double calculateSpeed();
    abstract double calculateVelocity();
}

// Car subclass
class Car extends Vehicle {
    private double distance;
    private double time;

    Car(double distance, double time) {
        this.distance = distance;
        this.time = time;
    }

    @Override
    public double calculateSpeed() {
        return distance / time;
    }

    @Override
    public double calculateVelocity() {
        return distance / time; // assuming straight-line motion
    }
}

// Bike subclass
class Bike extends Vehicle {
    private double distance;
    private double time;

    Bike(double distance, double time) {
        this.distance = distance;
        this.time = time;
    }

    @Override
    public double calculateSpeed() {
        return distance / time;
    }

    @Override
    public double calculateVelocity() {
        return distance / time; // assuming straight-line motion
    }
}

// Main class
public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Car(120, 2);   // distance in km, time in hours
        Vehicle bike = new Bike(60, 1.5);

        System.out.println("Car Speed: " + car.calculateSpeed() + " km/h");
        System.out.println("Car Velocity: " + car.calculateVelocity() + " km/h");

        System.out.println("Bike Speed: " + bike.calculateSpeed() + " km/h");
        System.out.println("Bike Velocity: " + bike.calculateVelocity() + " km/h");
    }
}
