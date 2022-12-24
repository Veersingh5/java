package Recursion_Assignment;
import java.util.Scanner;
public class PairStar {
    static Scanner s = new Scanner(System.in);
    public static String addStars(String s) {
        if(s.length() == 1) {
            return s;
        }
        String smallAns = addStars(s.substring(1));
        if(s.charAt(0) == smallAns.charAt(0)) {
            return s.charAt(0) + "*" + smallAns;
        }
        else {
            return s.charAt(0) + smallAns;
        }
    }
    public static void main(String[] args) {
        String S = s.nextLine();
        System.out.println(addStars(S));
    }
}
