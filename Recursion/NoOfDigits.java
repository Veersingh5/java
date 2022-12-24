package Recursion;
import java.util.Scanner;
public class NoOfDigits {
    static Scanner s = new Scanner(System.in);
    public static int count(int n) {
            if(n == 0) {
                return 0;
            }
            return  count(n / 10) + 1;
    }
    public static void main(String[] args) {
        int n = s.nextInt();
        System.out.println(count(n));
    }
}
