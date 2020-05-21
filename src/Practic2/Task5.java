package Practic2;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        String b = d.nextLine();
        System.out.println(getDecimalPlaces(b));
    }
    public static double getDecimalPlaces(String b) {
        int s = 0;
        float a = Float.parseFloat(b);
        while ((a*10)%10!=0){
            s = s + 1;
            a = a * 10;
        }
        return s;
    }
}