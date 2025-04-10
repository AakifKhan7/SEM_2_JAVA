/*
 * Q1)Create an abstract class pen with methods write () and refill () as
abstract methods
Q2)Use the pen class from Q1 to create a concrete class fountain pen with
additional method change Nib ()
Q3)Create a class monkey with jump ( ) and bite ( ) methods Create a
class human whichinherits this monkey class and implements basicanimal
interface with eat ( ) and sleep methods
Q4)Create a class telephone with ( ) , lift ( ) and disconnected ( ) methods
as abstract methods create another class smart telephone and
demonstrate polymorphism
Q5)Demonstrate polymorphism using using monkey class from Q3
Q6)Create an interface TVremote and use it to inherit another interface
smart TVremote
Q7)Create a class TV which implements TVremote interface from Q6
 */

package Chapter1;

class monkey{
    void jump(){
        System.out.println("Jump");
    }
    void bite(){
        System.out.println("bite");
    }
}

abstract class pen {
    abstract void write();
    abstract void refill();
}
class fountainPen extends pen{
    public void write(){
        System.out.println("write");
    }
    public void refill(){
        System.out.println("Refill");
    }
    public void Nib(){
        System.out.println("nib");
    }
}

public class PB47 {
    
}
