package Practic2;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int a = d.nextInt();
        System.out.println(Fibonacci(a));
    }
    public static int Fibonacci(int a) {
        if (a==0 || a==1) return 1;
        int s = Fibonacci(a-1) + Fibonacci(a-2);
        return s;
    }
}