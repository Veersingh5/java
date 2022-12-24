package Recursion;
import java.util.Scanner;
public class CheckNumInArray {
    static Scanner s = new Scanner(System.in);
    public static boolean CheckNum(int input[], int x, int startIndex) {
        if(startIndex == input.length) {
            return false;
        }
        if(input[startIndex] == x) {
            return true;
        }
        return CheckNum(input, x, startIndex+1);
    }
    public static boolean CheckNum(int arr[], int x) {
        return CheckNum(arr, x, 0);
    }
    public static void main(String[] args) {
        int size = s.nextInt();
        int[] input = new int[size];
        for(int i =0; i<size; i++) {
            input[i] = s.nextInt();
        }
        int x = s.nextInt();
        System.out.println(CheckNum(input, x));
    }
    
}
