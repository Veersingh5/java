package Array1;
import java.util.Scanner;
public class ArraySum {
    static Scanner s = new Scanner(System.in);
    public static int[] takingInput() {
        int size = s.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static int sum(int[] arr) {
            int sum=0;
            for(int i=0;i<arr.length;i++) {
                sum = sum + arr[i];
            }
            return sum;
    }

public static void main(String[] args) {
    int testCases = s.nextInt();
    
    while (testCases != 0) {
        int[] arr = takingInput();
        System.out.println(sum(arr));
        testCases--;
    }
    }
}