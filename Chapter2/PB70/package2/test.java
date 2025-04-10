package Chapter2.PB70.package2;

import Chapter2.PB70.package1.demo;

public class test extends demo{
    public static void main(String[] args) {
        test d = new test();
        // System.out.println(d.proValue);
        // System.out.println(d.defValue);
        System.out.println(d.proValue); // accessible if inherited && created object of inherited class
        System.out.println(d.pubValue);

        d.showValues();


    }
}
