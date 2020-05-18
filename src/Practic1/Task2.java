package Practic1;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        double a = b.nextDouble();
        double h = b.nextDouble();
        System.out.println(triArear(a,h));
    }
    public static double triArear(Double a, Double h) {
        double s = (a * h)/2;
        return s;
    }
}
