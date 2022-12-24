package CodingNinjas.Array2;
import java.util.Scanner;
public class CodeInsertionSort {
    public static void insertionSort(int[] arr) {
    	//Your code goes here
        for(int i=1;i<arr.length;i++) {
            int j = i-1;
            int temp = arr[i];
            while(j>=0 && arr[j]>temp) {
                arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1] = temp;
            }
        }
        public static int[] takeInput() {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) {
                arr[i] = s.nextInt();
            }
            return arr;
            }
        public static void display(int[] arr) {
            for(int i = 0; i < arr.length;i++) {
               System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int t = s.nextInt();
            
            while(t!=0 && 1<=t && t<=100) {
                int[] arr = takeInput();
                insertionSort(arr);
                display(arr);
                t--;
                }
        }
}
