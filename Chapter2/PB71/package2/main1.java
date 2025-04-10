package Chapter2.PB71.package2;

import Chapter2.PB71.package1.Circle;

public class main1 {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.display();
        System.out.println("Area: " + c.getArea());
        System.out.println("Circumference: " + c.getCircumference());

    }
}
