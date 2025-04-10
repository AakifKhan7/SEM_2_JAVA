package Chapter2.PB68.Pakage1;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {

    }

    protected int reverse() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 0;
        while (n > 0) {
            temp *= 10;
            temp = temp + (n % 10);
            n = n / 10;
        }
        sc.close();
        return temp;
    }
    public int rev(){
        return reverse();
    }
}
