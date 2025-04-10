package Chapter3;

public class PB106 {
    public static void main(String[] args) {
        try {
            ExceptionDemo1 e = new ExceptionDemo1();
            e.compute(14);
        } catch (MyException1 m) {
            System.out.println(m.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}

class MyException1 extends RuntimeException{
    public MyException1(String message) {
        super(message);
    }
}
class ExceptionDemo1{
    void compute(int a)throws MyException1{
        if(a % 7 == 0 && !(a % 5 == 0)){
            throw new MyException1("Exception occurred in compute() method");
        }
    }
}