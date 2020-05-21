package Practic2;
import java.util.Scanner;

public class Task10{
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.println("Введите шаг: ");
        int a = d.nextInt();
        System.out.println("Результат: " + boxSeq(a));
    }
    public static int boxSeq(int a) {
        if (a == 0) return 0;
        if (a % 2 == 0) return a;
        else return boxSeq(a - 1) + 3;
    }
}