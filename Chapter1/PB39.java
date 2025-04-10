/*
 * Create interface Univerity with method takeExam(). Create Interface
State with method getName(). Create interface StateUniversity that
extends University and State. Create print() inside StateUniversity.
Create class TestState that implements StateUniversity interface. and
Create a class with main method that calls all methods of TestState class
 */
package Chapter1;

public class PB39 {
    public static void main(String[] args) {
        TestState testState = new TestState();
        testState.takeExam(); // Calls the method from Univerity interface
        System.out.println("University Name: " + testState.getName()); // Calls the method from State interface
        testState.print(); // Calls the method from StateUniversity interface
    }
}
interface Univerity{
    void takeExam();
}
interface State{
    String getName();
}
interface StateUniversity extends Univerity, State{
    void print();
}
class TestState implements StateUniversity{
    public void takeExam(){
        System.out.println("Taking exam in State University.");
    }
    public String getName(){
        return "State University";
    }
    public void print(){
        System.out.println("This is a state university.");
    }
}
