package Chapter3;

public class PB107 {
    public static void main(String[] args) {
        try{
            for(int i = 0; i < 5; i++){
                int marks = Integer.parseInt(args[i]);
                if(marks < 35){
                    throw new ExceptionDemo3("Marks less than 35: " + marks);
                }
            }
        }catch(ExceptionDemo3 i){
            System.out.println(i.getMessage());
        }
        catch(NumberFormatException n){
            System.out.println(n);
        }
        catch(ArrayIndexOutOfBoundsException ae){
            System.out.println(ae);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

class ExceptionDemo3 extends RuntimeException{
    public ExceptionDemo3(String message) {
        super(message);
    }
}
