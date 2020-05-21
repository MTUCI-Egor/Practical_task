package Practic2;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.println("Введите рамзер массива: ");
        int size = d.nextInt();
        int array[] = new int[size];
        System.out.println("Введите значения массива:");
        for (int i = 0; i < size; i++) {
            array[i] = d.nextInt();
        }
        System.out.println(differenceMaxMin(size, array));
    }
    public static int differenceMaxMin(int size, int array[]) {
        int max = 0;
        int min = 1000000000;
        for (int i = 0; i < size; i++){
            if (max < array[i]){
                max = array[i];
            }
            if (min > array[i]){
                min = array[i];
            }
        }
        int z = max - min;
        return z;
    }
}