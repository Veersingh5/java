package Recursion_Assignment;
import java.util.Scanner;
public class Muliplication {
    static Scanner s = new Scanner(System.in);
    public static int multiplyTwoIntegers(int m, int n) {
        if(n==0) {
            return 0;
        }
        return m + multiplyTwoIntegers(m, n-1);
    }
    public static void main(String[] args) {
        int m = s.nextInt();
        int n = s.nextInt();
        System.out.println(multiplyTwoIntegers(m, n));
    }
}
