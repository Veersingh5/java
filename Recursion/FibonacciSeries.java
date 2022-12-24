package Recursion;
import java.util.Scanner;
public class FibonacciSeries {
    static Scanner s = new Scanner(System.in);
    public static int fibo(int n) {
        if(n==0 || n==1) {
            return 1;
        }
        // System.out.println(fibo(n-1) + " " + fibo(n-2));
        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) {
        int n = s.nextInt();
        System.out.println(fibo(n));
    }
}
