package Practic1;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        double a = d.nextDouble();
        double b = d.nextDouble();
        double c = d.nextDouble();
        System.out.println(operation(a, b, c));
    }
    public static String operation(double a, double b, double c) {
        String v1 = "addition";
        String v2 = "subtracted";
        String v3 = "multiplication";
        String v4 = "division";
        String v5 = "none";
        if (a + b == c) {
            return v1;
        }
        else if (a - b == c){
            return v2;
        }
        else if (a * b == c){
            return v3;
        }
        else if (a / b == c){
            return v4;
        }
        else {
            return v5;
        }
    }
}