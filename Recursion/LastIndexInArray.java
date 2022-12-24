package Recursion;
import java.util.Scanner;
public class LastIndexInArray {
    static Scanner s = new Scanner(System.in);
    public static int LastIndex(int input[], int x, int lastIndex) {
        if(lastIndex < 0) {
            return -1;
        }
        if(input[lastIndex] == x) {
            return lastIndex;
        }
        return LastIndex(input, x, lastIndex-1);
    }
    public static int LastIndex(int input[], int x) {
       
        return LastIndex(input, x, input.length-1);
    }
    public static void main(String[] args) {
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i =0; i<size; i++) {
            arr[i] = s.nextInt();
        }
        int x = s.nextInt();
        System.out.println(LastIndex(arr, x));
    }   
}