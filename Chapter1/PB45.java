/*  
 * Create an interface named Polygon. It has a default method getSides()
and an abstract method getArea().create two classes Rectangle and
Square that implement Polygon.The Rectangle class provides the
implementation of the getArea() method and overrides the getSides()
method. the Square class only provides the implementation of the
getArea() method.
while calling the getSides() method using the Rectangle object, the
overridden method is called. However, in the case of the Square object,
the default method is called.

 */

package Chapter1;

public class PB45 {
    public static void main(String[] args) {
        Polygon s = new Squre2();
        Polygon r = new Rectangle2();
        s.getArea();
        s.getSides();
        r.getArea();
        r.getSides();
    }
}
interface Polygon{
    default int getSides() {
        return 0; // Default implementation
    }
    
    double getArea(); // Abstract method to calculate area
}
class Rectangle2 implements Polygon{
    public double getArea(){
        return 7 * 7;
    }
    public int getSides(){
        return 2;
    }
}
class Squre2 implements Polygon{
    public double getArea(){
        return 3* 3;
    }
}