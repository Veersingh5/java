package Recursion;
import java.util.Scanner;
public class ArraySoorted1 {
    static Scanner s = new Scanner(System.in);
    public static boolean isSoorted(int arr[]) {
        if(arr.length == 1) {
            return true;
        }
        if(arr[0] > arr[1]) {
            return false;
        }
        int smallarr[] = new int[arr.length - 1];
        for(int i=1;i<arr.length;i++) {
            smallarr[i-1] = arr[i];
        }
        boolean isSmallArraySoorted = isSoorted(smallarr);
        return isSmallArraySoorted;
    }
    public static void main(String[] args) {
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println(isSoorted(arr));
    }
}
