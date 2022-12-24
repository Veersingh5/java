package Recursion;
import java.util.Scanner;
public class CalculatePower {
    static Scanner s = new Scanner(System.in);
    public static int power(int x, int n) {
        if(0<=n && n<=30 && 0<=x && x<=30)
        if(n==0) {
            return 1;
        }
        int smallOutput = power(x, n-1);
        int Output = x * smallOutput;
        return Output;
    }
    public static void main(String[] args) {
        int x = s.nextInt();
        int n = s.nextInt();
        System.out.println(power(x, n));
    }
}
