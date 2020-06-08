package Practic3;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = d.nextLine();
        System.out.println(flipEndChars(str));
    }
    private static String flipEndChars(String str){
        String s = "";
        if(str.length()<2) {
            return "Несовместимо";
        }
        else if (str.charAt(0)==str.charAt(str.length()-1)) {
            return "два-это пара";
        } else {
            s = s + str.charAt(str.length() - 1);
        }
        for(int i = 1; i < str.length() - 1; i++){
            s = s + str.charAt(i);
        }
        s = s + str.charAt(0);
        return s;
    }
}