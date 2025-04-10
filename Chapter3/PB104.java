package Chapter3;

public class PB104 {
    public static void main(String[] args) {
        try{
            for(int i = 0; i < args.length; i++){
                if(!Character.isUpperCase(args[i].charAt(0))){
                    throw new IllegalArgumentException("First character of each argument must be uppercase.");
                }
            }
        }catch(IllegalArgumentException i){
            System.out.println(i.getMessage());
        }catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Please provide at least one argument.");
        }catch(Exception e){
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }finally{
            System.out.println("Execution completed.");
        }
    }
}
