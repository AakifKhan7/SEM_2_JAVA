package Chapter3;

public class PB105 {
    public static void main(String[] args) {
        ExceptionDemo obj = new ExceptionDemo();
        try {
            obj.compute(15);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}

class MyException extends RuntimeException {
    public MyException(String message) {
        super(message);
    }
}

class ExceptionDemo{
    void compute(int a)throws MyException{
        if(a > 10){
            throw new MyException("Exception occurred in compute() method");
        }
    }
}
