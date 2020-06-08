package Practic3;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.println("Введите строку");
        String s = d.nextLine();
        System.out.println(" Позиция второго вхождения: " + findZip(s));
    }
    private static int findZip(String s) {
        int g = -1;
        int k = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            char ch = s.charAt(i);
            char ch1 = s.charAt(i + 1);
            char ch2 = s.charAt(i + 2);
            if (ch == 'z' && ch1 == 'i' && ch2 == 'p') {
                k++;
                if (k == 2) g = i;
            }
        }
        return g;
    }

}