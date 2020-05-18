package Practic1;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int zn = d.nextInt();
        addUpTo(zn);
    }
    public static void addUpTo(int zn) {
        int s = 0;
       for(int i = 0; i < zn + 1; i++ ){
           s = s + i;
       }
       System.out.println(s);
    }
}