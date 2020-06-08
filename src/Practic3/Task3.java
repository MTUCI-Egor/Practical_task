package Practic3;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int a = d.nextInt();
        System.out.println(checkPerfect(a));
    }
    private static boolean checkPerfect(int a) {
        int s = 0;
        for (int i = 1; i < a; i++) { //
            if (a % i == 0) {
                s = s + i;
            }
        }
        if (s == a) {
            return true;
        } else {
            return false;
        }
    }
}