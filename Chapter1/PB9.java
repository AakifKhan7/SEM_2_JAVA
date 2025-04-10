package Chapter1;

class Fruit{
    void display(){
        System.out.println("This is a fruit.");
    }
}
class Apple extends Fruit{
    void display(){
        System.out.println("This is an apple.");
    }
}
class Banana extends Fruit{
    void display(){
        System.out.println("This is a banana.");
    }
}


public class PB9 {
    public static void main(String[] args) {
        Fruit fruit = new Fruit(); // Fruit reference and object
        Fruit apple = new Apple(); // Fruit reference but Apple object
        Fruit banana = new Banana(); // Fruit reference but Banana object
        
        fruit.display(); // runs the method in Fruit class
        apple.display(); // runs the method in Apple class
        banana.display(); // runs the method in Banana class
    }
}
