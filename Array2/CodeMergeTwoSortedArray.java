package Array2;
import java.util.Scanner;
public class CodeMergeTwoSortedArray {
    static Scanner s = new Scanner(System.in);
    public static int[] merge(int arr1[], int arr2[]) {
    	//Your code goes here
        int m = arr1.length;
        int n  = arr2.length;
        int[] arr = new int[m+n];
        int i=0, j=0, k=0;

        while(i<m && j<n) {
            if(arr1[i] <=arr2[j]) {
                arr[k] = arr1[i];
                i++;
                k++;
            }
            else {
                arr[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i<m) {
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while(j<n) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
        return arr;
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
			int[] arr1 = takeInput();
			int[] arr2 = takeInput();
			int[] arr3 = merge(arr1,arr2);
			display(arr3);
			t--;
			}
	}
}
