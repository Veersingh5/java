package Array1.Assignment;
import java.util.Scanner;
public class Sort0and1 {
    static Scanner s = new Scanner(System.in);
    public static void sortZeroesAndOne(int[] arr) {
        int c = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==0) {
                c++;
            }
        }
        for(int i=0;i<c;i++) {
            arr[i] = 0;
        }
        for(int i=c;i<arr.length;i++) {
            arr[i]=1;
        }
    }
    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        int testCases = s.nextInt();
        while (testCases != 0) {
            int size = s.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = s.nextInt();
            }
            sortZeroesAndOne(arr);
            printArray(arr);
            testCases--;
        }
    }
}
