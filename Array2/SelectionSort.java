package CodingNinjas.Array2;
import java.util.Scanner;
public class SelectionSort {
    public static void selectionSort(int[] arr) {
    	//Your code goes here
        for (int i=0;i<arr.length-1;i++) {
            int min = Integer.MAX_VALUE;
            int minindex =-1;
            for (int j=i;j<arr.length;j++) {
                if(arr[j]<min) {
                    min =arr[j];
                    minindex = j;
                }
            }
            int temp = arr[minindex];
            arr[minindex] = arr[i];
            arr[i] = temp;
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
			selectionSort(arr);
			display(arr);
			t--;
			}
	}
}
