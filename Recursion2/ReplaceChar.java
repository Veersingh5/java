package Recursion2;
import java.util.Scanner;
public class ReplaceChar {
    static Scanner s = new Scanner(System.in);
    public static String replaceChar(String str, char x, char y) {
        if(str.length() == 0) {
            return str;
        } 
        if(str.charAt(0) == x) {
            return y + replaceChar(str.substring(1), x, y);
        }
        else {
            return str.charAt(0) + replaceChar(str.substring(1), x, y);
        }
    }
    public static void main(String[] args) {
        
        System.out.println(replaceChar("abcxdxex", 'x', 'y'));
    }
}
