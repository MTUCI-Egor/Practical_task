package Practic3;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.println("Введите 1-ое ребро: ");
        double  a = d.nextDouble();
        System.out.println("Введите 2-ое ребро: ");
        double  b = d.nextDouble();
        System.out.println("Введите 3-е ребро: ");
        double  c = d.nextDouble();
        System.out.println(rightTriangle(a,b,c));
    }
    private static boolean rightTriangle(double a, double b, double c){
        if(a > b && a > c) {
            if (b*b+c*c==a*a) return true;
        else return  false;
        }
        if(c > b && c > a) {
            if (b*b + a*a == c*c) return true;
            else return false; }
        if (b > c && b >a){ 
            if (c*c + a*a == b*b) return true;
            else return false;}
        return false;
    }
}