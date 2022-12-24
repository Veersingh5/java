package Recursion;
import java.util.Scanner;
public class FirstNthNaturalnumber {
    static Scanner s = new Scanner(System.in);
    public static void print(int n) {
        if(n==0) {
            return;
        }
        print(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        int n = s.nextInt();
        print(n);
    }
}
