package Chapter3;

public class PB110 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i < args.length; i++){
            try{
                int a =  Integer.parseInt(args[i]);
                check(a);
                sum += a;
            }catch(NumberFormatException ne){
                
            }
            catch(IllegalArgumentException ae){

            }
            catch(Exception e){

            }
        }
        System.out.println(sum);
    }
    static void check(int a){
        if(a < 0 || a % 10 == 0 || (a > 1000 && a < 2000) || a > 7000){
            throw new IllegalArgumentException();
        }
    }
}

