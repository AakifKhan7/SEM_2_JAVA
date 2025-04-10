/*  Write a program that illustrates interface inheritance. Interface A is
extended by A1 and A2.
Interface A12 inherits from both P1 and P2.Each interface declares one
constant and one method. Class B implements A12.Instantiate B and
invoke each of its methods. Each method displays one of the constants */

package Chapter1;

public class PB38 {
    public static void main(String[] args) {
        B b = new B(); // B reference and object
        b.display(); // calling display method from A
        b.show(); // calling show method from A1
        b.print(); // calling print method from A2
        b.displayAll(); // calling displayAll method from A12
    }
}
interface A{
    int x = 10; // constant
    void display(); // method to be implemented in class B
}

interface A1 extends A{
    int y = 20; // constant
    void show(); // method to be implemented in class B
}
interface A2 extends A{
    int z = 30; // constant
    void print(); // method to be implemented in class B
}
interface A12 extends A1,A2{
    int w = 40; // constant
    void displayAll(); // method to be implemented in class B
}
class B implements A12 {
    public void display() {
        System.out.println("Value of x: " + x);
    }
    public void show() {
        System.out.println("Value of y: " + y);
    }
    public void print() {
        System.out.println("Value of z: " + z);
    }
    public void displayAll() {
        System.out.println("Value of w: " + w);
    }
}
