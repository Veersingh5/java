package Array2;
import java.util.Scanner;
public class CodeBubbleSort {
	static Scanner s = new Scanner(System.in);
    public static void bubbleSort(int[] arr){
    	//Your code goes here
        for(int i=0;i<arr.length-1;i++) {
            for(int j=0;j<arr.length-1;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
	public static int[] takeInput() {
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
		int t = s.nextInt();
		
		while(t!=0 && 1<=t && t<=100) {
			int[] arr = takeInput();
			bubbleSort(arr);
			display(arr);
			t--;
			}
	}
    
}
