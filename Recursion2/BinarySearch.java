package Recursion2;
import java.util.Scanner;
public class BinarySearch {
    static Scanner s = new Scanner(System.in);
    public static int binarySearch(int input[], int x, int startIndex, int endIndex) {
        if(startIndex > endIndex) {
            return -1;
        }
        int midIndex = (startIndex + endIndex)/2;
        if(input[midIndex] == x) {
            return midIndex;
        }
        else if(input[midIndex] < x) {
            return binarySearch(input, x, midIndex + 1, endIndex);
        }
        else {
            return binarySearch(input, x, midIndex - 1, endIndex);
        }
    }
    // public static int binarySearch(int input[], int x) {
    //     return binarySearch(input, x, 0, input.length-1);
    // }
    public static void main(String[] args) {
        int size = s.nextInt();
        int[] input = new int[size];
        for(int i=0;i<size;i++) {
            input[i] = s.nextInt();
        }
        int x = s.nextInt();
        // System.out.println(binarySearch(input, x));
        System.out.println(binarySearch(input, x, 0, input.length-1));
    }
}
