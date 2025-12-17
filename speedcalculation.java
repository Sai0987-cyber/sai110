import java.io.*;
import java.util.*;

// Abstract class
abstract class Vehicle {
    double distance, time;

    Vehicle(double distance, double time) {
        this.distance = distance;
        this.time = time;
    }

    abstract double calculateSpeed();
}

// Car class
class Car extends Vehicle {
    Car(double distance, double time) {
        super(distance, time);
    }

    double calculateSpeed() {
        return distance / time;
    }
}

// Bike class
class Bike extends Vehicle {
    Bike(double distance, double time) {
        super(distance, time);
    }

    double calculateSpeed() {
        return distance / time;
    }
}

// Main class
public class SpeedCalculation {
    public static void main(String[] args) {
        try {
            // Reading data from file
            File file = new File("input.txt");
            Scanner sc = new Scanner(file);

            double carDistance = sc.nextDouble();
            double carTime = sc.nextDouble();
            double bikeDistance = sc.nextDouble();
            double bikeTime = sc.nextDouble();

            Vehicle car
