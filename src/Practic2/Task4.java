package Practic2;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.println("Введите рамзер массива: ");
        int size = d.nextInt();
        int array[] = new int[size];
        System.out.println("Введите значения массива:");
        for (int i = 0; i < size; i++) {
            array[i] = d.nextInt();
        }
        for(int i:cumulativeSum(size, array))
            System.out.print(" " + i);
    }

    public static int[] cumulativeSum(int size, int[] array) {
        int s = 0;
        int array2[] = new int[size];
        for (int i = 0; i < size; i++){
            s = s + array[i];
            array2[i] = s;
        }
        return array2;
    }
}