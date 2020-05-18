package Practic1;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int a = d.nextInt();
        int b = d.nextInt();
        int c = d.nextInt();
        System.out.println(animals(a,b,c));
    }
    public static double animals(int a, int b, int c) {
        int chickens = 2;
        int cows = 4;
        int pigs = 4;
        int s = (a * chickens + b * cows + c * pigs);
        return s;
    }
}