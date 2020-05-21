package Practic2;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        String a = d.nextLine();
        System.out.println(isValid(a));
    }
    public static boolean isValid(String a) {
        int s = 0;
        for (int i = 0; i < a.length(); i++) {
            if (Character.isDigit(a.charAt(i))) {
                s = s + 1;
            }
        }
        if (s == 5 && a.length() ==5) return true;
        else return false;
    }
}