// Write a java program to implement the multiple inheritance concepts for
//calculating area of circle and square


package Chapter1;

public class PB37 {
    public static void main(String[] args) {
        Shape1 shape = new Shape1(); // Shape reference and object
        shape.area(5.0); // calling area method for circle
        shape.area(4); // calling area method for square
    }
}
interface Circle1 {
    void area(double radius); // method to calculate area of circle
}
interface Square1 {
    void area(int side); // method to calculate area of square
}
class Shape1 implements Circle1, Square1 {
    public void area(double radius) {
        double area = 3.14 * radius * radius; // using 3.14 as PI
        System.out.println("Area of Circle: " + area);
    }
    public void area(int side) {
        double area = side * side; // area of square = side * side
        System.out.println("Area of Square: " + area);
    }
}