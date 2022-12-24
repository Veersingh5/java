package Recursion2;
import java.util.Scanner;
public class Replace_pi {
    static Scanner s = new Scanner(System.in);
    public static String replacePi(String input) {
        if(input.length() <= 1) {
            return input;
        }
        if(input.charAt(0) == 'p' && input.charAt(1) == 'i') {
            return "3.14" + replacePi(input.substring(1));
        }
        else {
            return input.charAt(0) + replacePi(input.substring(1));
        }
    }
    public static void main(String[] args) {
        String input = s.nextLine();
        System.out.println(replacePi(input));
    }
}
