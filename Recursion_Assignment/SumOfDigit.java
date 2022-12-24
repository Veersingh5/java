package Recursion_Assignment;
import java.util.Scanner;
public class SumOfDigit {
    static Scanner s = new Scanner(System.in);
    public static int sumOfDigits(int input) {
        if(input == 0) {
            return 0;
        }
        return (input%10) + sumOfDigits(input/10);
    }
    public static void main(String[] args) {
        int input = s.nextInt();
        System.out.println(sumOfDigits(input));
    }
}
