package Recursion_Assignment;
import java.text.DecimalFormat;
import java.util.Scanner;
public class GeometricSum {
    static Scanner s = new Scanner(System.in);
    public static double geometricSum(int k) {
        if(k == 0) {
            return 1;
        }
        double smallAns = geometricSum(k-1);
        return smallAns + (1/Math.pow(2, k));
    }
    public static void main(String[] args) {
        int k = s.nextInt();
        double ans = geometricSum(k);
        DecimalFormat dec = new DecimalFormat("#0.00000");
        System.out.println(dec.format(ans));
    }
}
