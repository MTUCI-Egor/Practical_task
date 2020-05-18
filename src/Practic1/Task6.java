package Practic1;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        char a = reader.next(".").charAt(0);
        System.out.println(ctoa(a));
    }

    private static int ctoa(char а) {
        return (int) а;
    }
}