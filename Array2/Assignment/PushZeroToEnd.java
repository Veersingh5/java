package Array2.Assignment;
import java.util.Scanner;
public class PushZeroToEnd {
	static Scanner s = new Scanner(System.in);
    public static void pushZerosAtEnd(int[] arr) {
    	//Your code goes here
        int count = 0;  
        for (int i = 0; i < arr.length; i++) 
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
             while(count<arr.length)
             arr[count++]=0;
        
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
			int n = s.nextInt();
			int[] arr = new int[n];
			for(int i=0; i<n;i++) {
				arr[i] = s.nextInt();
			}
			pushZerosAtEnd(arr);
			display(arr);
			t--;
			}
	}
}
