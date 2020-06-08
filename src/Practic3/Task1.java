package Practic3;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int a = d.nextInt();
        int b = d.nextInt();
        int c = d.nextInt();
        solutions(a,b,c);
    }
    public static void solutions(int a, int b, int c) {
       double ds = b*b - 4*c;
       if (ds > 0){
           double x1 = (-1*b - Math.sqrt(ds))/(2*a) ;
           double x2 = (-1*b + Math.sqrt(ds))/(2*a) ;
           System.out. println("2 корня:" + " x1 = " + x1 + ", x2 = " + x2);
       }
        else if (ds == 0) {
            double x12 = (-1 * b) / (2 * a);
            System.out.println("1 корень:" + " x = " + x12);
        }
        else if (ds < 0) {
            System.out.println("Корней нет");
        }
    }
}
