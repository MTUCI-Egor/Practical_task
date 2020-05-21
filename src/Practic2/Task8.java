package Practic2;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        String a = d.nextLine();
        String b = d.nextLine();
        System.out.println(isStrangePair(a,b));
    }
    public static boolean isStrangePair(String a, String b) {
        char a1 = a.charAt(a.length() - 1);
        char a2 = a.charAt(0);
        char b1 = b.charAt(a.length() - 1);
        char b2 = b.charAt(0);
        if (a1 == b2 && a2 == b1) return true;
        else return false;
    }
}
