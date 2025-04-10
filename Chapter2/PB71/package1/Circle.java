package Chapter2.PB71.package1;

public class Circle {
    private double radius;
    private double area;
    private double circumference;

    public Circle(double radius) {
        this.radius = radius;
        this.area = Math.PI * radius * radius;
        this.circumference = 2 * Math.PI * radius;
    }

    public double getArea() {
        return area;
    }

    public double getCircumference() {
        return circumference;
    }

    public void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
    
}
