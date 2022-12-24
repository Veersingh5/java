package CodingNinjas.Array2.Assignment;
import java.util.Scanner;
public class RotateArray {
    public static void rotate(int[] arr, int d) {
    	//Your code goes here
         int[] temp = new int[d];
        
        for(int i=0; i<d; i++){
            temp[i] = arr[i];
        }
        int j = 0;
        for(int i = d; i<arr.length; i++){
            arr[j] = arr[i];
            j++;
        }
        j = 0;
        for(int i = arr.length - d; i<arr.length; i++){
            arr[i] = temp[j];
            j++;
        }
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
			int n = s.nextInt();
			int[] arr = new int[n];
			for(int i=0; i<n;i++) {
				arr[i] = s.nextInt();
			}
            int d = s.nextInt();
			rotate(arr, d);
			display(arr);
			t--;
			}
	}
}
