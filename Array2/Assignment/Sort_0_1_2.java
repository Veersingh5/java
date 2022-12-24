package CodingNinjas.Array2.Assignment;
import java.util.Scanner;
public class Sort_0_1_2 {
    public static void sort012(int[] arr){
    	//Your code goes here
        int indexOf0 = 0;
        int IndexOf2 = arr.length -1;
        int i = 1;
        int temp = 0;
        while(i < arr.length )  {
            if(arr[i] == 0 && i > indexOf0) {
                temp = arr[i];
                arr[i] = arr[indexOf0];
                arr[indexOf0] = temp;
                indexOf0++;
            } else if(arr[i] == 2 && i < IndexOf2) {
                temp = arr[i];
                arr[i] = arr[IndexOf2];
                arr[IndexOf2] = temp;
                IndexOf2--;
            } else
                i++;
        }
    }
    public static void display(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
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
     public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     int t = s.nextInt();
     
     while(t!=0 && 1<=t && t<=100) {
         int[] arr = takeInput();
         sort012(arr);
         display(arr);
         t--;
         }
 }
}
