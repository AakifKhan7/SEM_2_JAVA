// Java program to implement interface with hierarchical inheritance

package Chapter1;

public class PB34 {
    public static void main(String[] args) {
        Animal dog = new Dog(); // Animal reference and Dog object
        Animal cat = new Cat(); // Animal reference and Cat object
        Animal cow = new Cow(); // Animal reference and Cow object

        dog.sound(); // runs the method in Dog class
        cat.sound(); // runs the method in Cat class
        cow.sound(); // runs the method in Cow class
    }
}

interface Animal {
    void sound();
}
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}
class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}
class Cow implements Animal {
    public void sound() {
        System.out.println("Cow moos");
    }
}
