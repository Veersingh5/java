package Recursion2;
import java.util.Scanner;
public class RemoveDuplicateRecursively {
    static Scanner s = new Scanner(System.in);
    public static String removeDuplicateRecursively(String input) {
        if(input.length() <= 1) {
            return input;
        }
        String smallOutput = removeDuplicateRecursively(input.substring(1));
        if(smallOutput.charAt(0) == input.charAt(0)) {
            return smallOutput;
        }
        else {
            return input.charAt(0) + smallOutput;
        }
    }
    public static void main(String[] args) {
        String input = s.nextLine();
        System.out.println(removeDuplicateRecursively(input));
    }
}
