package Practic3;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int a = d.nextInt();
        System.out.println(isKaprekar(a));
    }
    private static boolean isKaprekar(int a) {
        boolean s = false;
        int k = 1;
        int kv = a * a;
        while (kv / 10 != 0) {
            kv = kv / 10;
            k++;
        }
        if (k == 1) {
            if (0 + (a * a) == a) s = true;
            else s = false;
        }
        if (k % 2 == 0) {
            int raz = k / 2;
            double a1 = (a * a) / (Math.pow(10, raz));
            int a6=(int) a1;
            double a2 = (a * a) % (Math.pow(10, raz));
            if (a6 + a2 == a) s = true;
            else s = false;
        }
        if (k % 2 != 0) {
            int raz = k / 2;
            double a3 = (a * a) / (Math.pow(10, k - raz));
            int  a5= (int) a3;
            double a4 = (a * a) % (Math.pow(10, k - raz));
            if (a4 +a5 == a) s = true;
            else s = false;
        }
        return s;
    }
}