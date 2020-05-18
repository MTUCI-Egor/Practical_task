package Practic1;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.println("Введите кол-во значений массива: ");
        int size = d.nextInt();
        int array[] = new int[size];
        System.out.println("Введите значения массива:");
        for (int i = 0; i < size; i++) {
            array[i] = d.nextInt();
        }
        System.out.println(sumOfCubes(size,array));
    }

    public static int sumOfCubes(int size, int array[]) {
        int s = 0;
        for (int i = 0; i < size; i++) {
            s = s + array[i] * array[i] * array[i];
        }
        return s;
    }
}