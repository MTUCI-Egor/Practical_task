package Practic1;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int a = d.nextInt();
        int b = d.nextInt();
        System.out.println(nextEdge(a,b));
    }
    public static int nextEdge(int a, int b) {
        int c = a + b - 1;
        return c;
    }
}