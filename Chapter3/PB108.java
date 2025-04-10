package Chapter3;

import java.util.Scanner;

public class PB108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature (in Celsius): ");
        int temp = sc.nextInt();
        System.out.print("Enter Humidity (in percentage): ");
        double Humidity = sc.nextDouble();
        System.out.print("Enter Wind Speed(km/h): ");
        double windSpeed = sc.nextDouble();
        try{
            if(temp >= 25 && Humidity >= 70 && windSpeed >= 15){
                throw new RainException("Please keep umbrella with you");
            }
            else{
                throw new LessRainException("you can enjoy your day without umbrella");
            }
        }catch(RainException re){
            System.out.println(re);
        }catch(LessRainException le){
            System.out.println(le);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            sc.close();
        }
    }
}

class RainException extends RuntimeException{
    RainException(String message){
        super(message);
    }
}
class LessRainException extends RuntimeException{
    LessRainException(String message){
        super(message);
    }
}