package patterns.inheritance;

import java.util.UUID;

public class Car implements Vehicle {

    private UUID uuid;
    private double weight;

    public Car() {
        this.uuid = UUID.randomUUID();
        this.weight = Math.ceil(Math.random() * 1500);
    }

    public UUID getUuid() {
        return uuid;
    }

    @Override
    public void drive() {
        System.out.println("Driving car with UUID " + uuid.toString());
    }

    @Override
    public void start() {
        System.out.println("Starting car with UUID " + uuid.toString());
    }

    @Override
    public void stop() {
        System.out.println("Stopping car with UUID " + uuid.toString());
    }

    @Override
    public double getWeightLbs() {
        System.out.println("Car with UUID " + uuid.toString() + " weighs " + weight + " lbs");
        return weight;
    }
}
