package Array1.Assignment;
import java.util.Scanner;
public class PairSum {
    static Scanner s = new Scanner(System.in);
    public static int pairSum(int arr[], int x) {
        int k=0;
        for(int i=0;i<arr.length;i++) {
            int temp = arr[i];
            for(int j=i+1;j<arr.length;j++) {
                if(temp+arr[j]==x) {
                    if(temp<arr[j]) {
                        k++;
                    }
                    if(temp>arr[j]) {
                       k++;
                    }
                    if(temp==arr[j]) {
                       k++;
                    }
                }
            }
        }
        return k;
    }
    public static int[] takeInput() {
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int testCases = s.nextInt();

        while (testCases != 0) {
            int[] arr = takeInput();
            int x = s.nextInt();
            System.out.println(pairSum(arr, x));
            testCases--;
        }
    }
}
