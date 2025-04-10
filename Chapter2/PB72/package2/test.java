package Chapter2.PB72.package2;
import Chapter2.PB72.package1.demo;

public class test extends demo{
    public static void main(String[] args) {
        demo d = new demo();
        test t = new test();
        System.out.println(t.protectedMessage);
        // System.out.println(t.defaultMessage);  not accessible in different package

        // System.out.println(d.protectedMessage); not accessible with base class or class in different package object
        // System.out.println(d.defaultMessage); not accessible


        // both accessible using binding
        d.showMessages();
        t.showMessages();
    }
}
