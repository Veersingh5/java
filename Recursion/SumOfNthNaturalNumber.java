package Recursion;
import java.util.Scanner;
public class SumOfNthNaturalNumber {
    static Scanner s = new Scanner(System.in);
    public static int sumOfnth(int n) {
        if(n==0) {
            return 0;
        }
        int smallOutput = sumOfnth(n-1);
        int Output = n + smallOutput;
        return Output;
    }
    public static void main(String[] args) {
        int n = s.nextInt();
        System.out.println(sumOfnth(n));
    }
    
}
