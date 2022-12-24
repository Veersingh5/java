package CodingNinjas.Array1.Assignment;
import java.util.Scanner;
public class SwapAlternate {
    public static void Swap(int[] arr) {
		for(int i=0;i<arr.length-1;i+=2) {
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
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
			Swap(arr);
			display(arr);
			t--;
			}
	}
}
