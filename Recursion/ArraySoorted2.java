package Recursion;
import java.util.Scanner;
public class ArraySoorted2 {
    static Scanner s = new Scanner(System.in);
    public static boolean isSoortedBetter(int arr[], int startIndex) {
        if(startIndex == arr.length-1) {
            return true;
        }
        if(arr[startIndex] > arr[startIndex + 1]) {
            return false;
        }
        boolean isSmallArraySoorted = isSoortedBetter(arr, startIndex+1);
        return isSmallArraySoorted;
    }
    public static void main(String[] args) {
        int size = s.nextInt();
        int[] arr = new int[size];
        int startIndex = 0;
        System.out.println(isSoortedBetter(arr, startIndex));
    }
}
