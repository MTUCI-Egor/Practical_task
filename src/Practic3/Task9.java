package Practic3;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int a = d.nextInt();
        System.out.println(nextPrime(a));
    }
    static int nextPrime(int a){
        int ch=0;
        if(inPrime(a)==true) ch= a;
        else for (int i=a;i<Math.pow(10,8);i++){
            if(inPrime(i)==true) {ch= i;break;}
        }
        return ch;
    }
    static boolean inPrime(int n) {
        boolean p=false;
        int i;
        if (n >= 10) {
            for (i = 2; i <= 9; i++) {
                if (n % i == 0)
                    return false;
            }
            p= true;
        }
        if (n < 10) {
            int k=0;
            for (i = 2; i <= 9; i++){
                if(n%i==0){
                    k++;
                }
            }
            if (k==1) p= true;
            else p= false;
        }
        return p;
    }
}