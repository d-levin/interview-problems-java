package patterns.inheritance;

public class SportsCar extends Car {

    @Override
    public void drive() {
        super.drive();
        System.out.println("Vroom!");
    }

}
