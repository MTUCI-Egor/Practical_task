package Practic2;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        String a = d.nextLine();
        String b = d.nextLine();
        if (isPrefix(a, b) == true) System.out.println(isPrefix(a, b));
        else if (isSuffix(a, b) == true) System.out.println(isSuffix(a, b));
        else System.out.println("false");
        }
    public static boolean isPrefix(String a, String b) {
        boolean c = true;
        int t = b.length() - 1;
        for (int i = 0; i < t - 1; i++) {
            if (a.charAt(i) == b.charAt(i));
            else c = false;
        }
        return c;
    }
    public static boolean isSuffix(String a, String b) {
        boolean v = true;
        int t = b.length() - 1;
        for (int i = 1; i <=t; i++) {
            if (a.charAt(a.length()-i) == b.charAt(b.length()-i));
            else v = false;
        }
        return v;
    }
}
