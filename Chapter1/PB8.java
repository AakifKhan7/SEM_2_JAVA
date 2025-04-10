package Chapter1;

class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
class cat extends Animal{
    void sound(){
        System.out.println("Cat meows");
    }
}
public class PB8{
    public static void main(String args[]){
        Animal a = new Animal(); // Animal reference and object
        Animal b = new dog(); // Animal reference but dog object
        Animal c = new cat(); // Animal reference but cat object
        a.sound(); // runs the method in Animal class
        b.sound(); // runs the method in dog class
        c.sound(); // runs the method in cat class
    }
}