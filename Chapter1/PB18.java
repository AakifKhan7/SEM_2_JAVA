/* 
The abstract Vegetable class has three subclasses named Potato, Brinjal
and Tomato. Write an application that demonstrates how to establish this
class hierarchy. Declare one instance variable of type String that indicates
the color of a vegetable. Create and display instances of these objects.
Override the toString() method of Object to return a string with the name
of the vegetable and its color. 

*/


package Chapter1;

public class PB18 {
    public static void main(String[] args) {
        Vegetable potato = new Potato("Brown");
        Vegetable brinjal = new Brinjal("Purple");
        Vegetable tomato = new Tomato("Red");

        System.out.println(potato);
        System.out.println(brinjal);
        System.out.println(tomato);
    }
}

abstract class Vegetable {
    String color;

    Vegetable(String color) {
        this.color = color;
    }

    abstract String getName();

    @Override
    public String toString() {
        return "Vegetable Name: " + getName() + ", Color: " + color;
    }
}

class Potato extends Vegetable {
    Potato(String color) {
        super(color);
    }

    @Override
    public String getName() {
        return "Potato";
    }
}

class Brinjal extends Vegetable {
    Brinjal(String color) {
        super(color);
    }

    @Override
    public String getName() {
        return "Brinjal";
    }
}

class Tomato extends Vegetable {
    Tomato(String color) {
        super(color);
    }

    @Override
    public String getName() {
        return "Tomato";
    }
}


