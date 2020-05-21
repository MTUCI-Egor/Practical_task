package Practic2;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String s = d.nextLine();
        System.out.println("Введите кол-во повторений:");
        int a = d.nextInt();
        System.out.println(repeat(s,a));
    }
    public static String repeat(String s, int a) {
        String st = "";
        for (int i = 0; i < s.length(); i++){
            char t = s.charAt(i);
            for (int j = 0; j < a; j++){
                st = st + t;
            }
        }
        return st;
    }
}