package patterns.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Car());
        vehicles.add(new Car());
        vehicles.add(new SportsCar());

        vehicles.forEach(Vehicle::start);
        vehicles.forEach(Vehicle::getWeightLbs);
        vehicles.forEach(Vehicle::drive);
        vehicles.forEach(Vehicle::stop);
    }

}
