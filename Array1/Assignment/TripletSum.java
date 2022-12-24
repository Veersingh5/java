package CodingNinjas.Array1.Assignment;
import java.util.Scanner;
public class TripletSum {
    public static int findTriplet(int[] arr, int x) {
        int p=0;
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                for(int k=j+1;k<arr.length;k++) {
                    if(arr[i] + arr[j] + arr[k] == x) {
                        p++;
                    }
                }
            }
        }
        return p;
        
    }
    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testCases = s.nextInt();

        while (testCases != 0) {
            int[] arr = takeInput();
            int x = s.nextInt();
            System.out.println(findTriplet(arr, x));
            testCases--;
        }
    }
}
