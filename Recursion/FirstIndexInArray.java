package Recursion;
import java.util.Scanner;
public class FirstIndexInArray {
    static Scanner s = new Scanner(System.in);
    public static int FirstIndex(int input[], int x, int startIndex) {
        if(startIndex == input.length) {
            return -1;
        }
        if(input[startIndex] == x) {
            return startIndex;
        }
        return FirstIndex(input, x, startIndex+1);
    }
    public static int FirstIndex(int input[], int x) {
       
        return FirstIndex(input, x, 0);
    }
    public static void main(String[] args) {
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i =0; i<size; i++) {
            arr[i] = s.nextInt();
        }
        int x = s.nextInt();
        System.out.println(FirstIndex(arr, x));
    }
    
}