package Recursion2;
import java.util.Scanner;
public class RemoveX {
    static Scanner s = new Scanner(System.in);
    public static String removeX(String input) {
        if(input.length() == 0) {
            return input;
        }
        if(input.charAt(0) == 'x') {
            return removeX(input.substring(1));
        }
        else {
            return input.charAt(0) + removeX(input.substring(1));
        }
    }
    public static void main(String[] args) {
        String input = s.nextLine();
        System.out.println(removeX(input));
    }
}