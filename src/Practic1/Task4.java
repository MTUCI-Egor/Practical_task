package Practic1;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        double prob = d.nextDouble();
        double prize = d.nextDouble();
        double pay = d.nextDouble();
        System.out.println(profitableGamble(prob, prize, pay));
    }
    public static boolean profitableGamble(double prob, double prize, double pay) {
        if ((prob * prize) > pay) {
            return true;
        } else {
            return false;
        }

    }
}