package Practic2;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.println("Введите рамзер массива: ");
        int size = d.nextInt();
        double array[] = new double[size];
        System.out.println("Введите значения массива:");
        for (int i = 0; i < size; i++) {
            array[i] = d.nextInt();
        }
        System.out.println(isAvgWhole(size, array));
    }
    public static boolean isAvgWhole(int size, double array[]) {
        double s = 0;
        for (int i = 0; i < size; i++){
            s = s + array[i];
        }
        if ((s/size) % 1 == 0) return true;
        else return false;
    }
}