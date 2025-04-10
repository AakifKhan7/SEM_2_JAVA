/* Write a program that demonstrates the instanceof operator.Declare
interfaces I1 and I2. Interface I3 extends both of these interfaces.Also
declare interface I4.class X implements I3.Class W extends X and
implements I4.create an object of class W.Use the instanceof operator to
test if that object implements each of the interfaces and is of type X.
*/

package Chapter1;

public class PB36 {
    public static void main(String[] args) {
        W w = new W();
        System.out.println("w instanceof I1: " + (w instanceof X)); // true
    }
}

interface I1 {
    void method1();
}
interface I2 {
    void method2();
}
interface I3 extends I1, I2 {
    void method3();
}
interface I4 {
    void method4();
}
class X implements I3 {
    public void method1() {
        System.out.println("Method 1 from I1");
    }
    public void method2() {
        System.out.println("Method 2 from I2");
    }
    public void method3() {
        System.out.println("Method 3 from I3");
    }
}
class W extends X implements I4 {
    public void method4() {
        System.out.println("Method 4 from I4");
    }
}

