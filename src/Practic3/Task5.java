package Practic3;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        String str = d.nextLine();
        System.out.println(isValidHexCode(str));
    }
    private static boolean isValidHexCode(String str) {
        boolean r  = false;
        if(str.length() == 7 && str.charAt(0)=='#'){
            for (int i = 0; i < str.length(); i++){
                char ch = str.charAt(i);
                if(ch =='0' || ch =='1' || ch =='2' || ch =='3' || ch =='4' || ch =='5' || ch =='6' || ch =='7' || ch =='8' || ch =='9'|| ch =='A'||ch =='B'||ch =='C'||ch =='D'||ch =='F' ||ch =='E') {
                    r = true;
                }
                else r = false;
            }
        }
        return r;
    }
}