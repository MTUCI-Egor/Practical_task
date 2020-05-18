package Practic1;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int a = d.nextInt();
        int b = d.nextInt();
        int c = d.nextInt();
        System.out.println(abcmath(a, b ,c));
    }

    public static boolean abcmath(int a, int b, int c) {
        int s = 0;
        for (int i = 0; i < b; i++) {
            a = a + a;
        }
        if (a % c == 0){
            return true;
        } else {
            return false;
        }
    }
}