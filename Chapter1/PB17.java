package Chapter1;

abstract class Shape{
    abstract void area();
}

class Circle extends Shape{
    public void area(){
        System.out.println("Area of Circle: πr²");
        System.out.println(3.14 * 5 * 5); // Example radius = 5
    }
}

class Triangle extends Shape{
    public void area(){
        System.out.println("Area of Triangle: ½bh");
        System.out.println(0.5 * 5 * 10); // Example base = 5, height = 10
    }

}
class Rectangle extends Shape{
    public void area(){
        System.out.println("Area of Rectangle: lw");
        System.out.println(5 * 10); // Example length = 5, width = 10
    }
}

public class PB17 {
    public static void main(String[] args) {
        Shape circle = new Circle(); // Shape reference but Circle object
        Shape triangle = new Triangle(); // Shape reference but Triangle object
        Shape rectangle = new Rectangle(); // Shape reference but Rectangle object
        
        circle.area(); // runs the method in Circle class
        triangle.area(); // runs the method in Triangle class
        rectangle.area(); // runs the method in Rectangle class
    }
}
