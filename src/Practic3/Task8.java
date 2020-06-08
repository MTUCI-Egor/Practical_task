package Practic3;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        String s = d.nextLine();
        System.out.println(longestZero(s));
    }
    private static String longestZero(String s){
        String str1="";
        String max="";
        for (int i=0; i<s.length();i++){
            if (s.charAt(i)=='0'){
                str1=str1+s.charAt(i);
                if(str1.length()>max.length()) max=str1;
            }
            if (s.charAt(i)=='1') str1="";
        }
        return max;
    }
}