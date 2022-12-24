package Recursion_Assignment;
import java.util.Scanner;
public class CheckPalidrome {
    static Scanner s = new Scanner(System.in);
    public static boolean isStringPalindrome(String input) {
        if(input.length()<=1) {
            return true;
        }
        int smallAns = input.length() -1;
        if(input.charAt(0) == input.charAt(smallAns)) {
            return isStringPalindrome(input.substring(1, smallAns));
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        String input = s.nextLine();
        System.out.println(isStringPalindrome(input));
    }
}
