package Practic1;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        int y = a.nextInt();
        System.out.println(remainder(x,y));
    }
    public static int remainder(int x, int y) {
        int c= x % y;
        return c;
    }
}
