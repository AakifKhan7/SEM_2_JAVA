// Write a java program to explain runtime polymorphism using interfaces

package Chapter1;

public class PB35 {
    public static void main(String[] args) {
        Vehicle car = new Car(); // Vehicle reference but Car object
        Vehicle bike = new Bike(); // Vehicle reference but Bike object

        car.start(); // runs the method in Car class
        bike.start(); // runs the method in Bike class
    }
}

interface Vehicle {
    void start();
}
class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is starting");
    }
}

