package Recursion_Assignment;
import java.util.Scanner;
public class StairCase {
    static Scanner s = new Scanner(System.in);
    public static int staircase(int n) {
        if(n<0) {
            return 0;
        }
        if(n==0) {
            return 1;
        }
        int step_1 = staircase(n-1);
        int step_2 = staircase(n-2);
        int step_3 = staircase(n-3);
        return step_1 + step_2 + step_3;
    }
    public static void main(String[] args) {
        int n = s.nextInt();
        System.out.println(staircase(n));
    }
}
