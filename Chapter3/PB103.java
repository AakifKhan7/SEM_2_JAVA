package Chapter3;

public class PB103 {
    static int pow(int x, int y)throws IllegalArgumentException{
        if(y <= 0){
            throw new IllegalArgumentException("y must be greater than 0");
        }
        for(int i = 1; i < y; i++){
            x *= x;
        }
        return x;
    }

    public static void main(String[] args) {
        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);

            int result = pow(x, y);
            System.out.println("Result: " + result);
            
        } catch (IllegalArgumentException i) {
            System.out.println(i);
        }catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Please provide two integer arguments.");
        }catch(Exception e){
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
        finally{
            System.out.println("Execution completed.");
        }
    }

}
