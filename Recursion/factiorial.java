package Recursion;
import java.util.Scanner;
public class factiorial {
    static Scanner s = new Scanner(System.in);
    public static int fact(int n) {
        if(n==0) {
            return 1;
        }
        // System.out.print(n*fact(n-1) + " ");
        return n *fact(n-1);
    }
    public static void main(String[] args) {
        int n = s.nextInt();
        System.out.println(fact(n));
    }
}