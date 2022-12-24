package Array1;
import java.util.Scanner;
public class ArrangeNumInArray {
	static Scanner s = new Scanner(System.in);
    public static void ArrangeNum(int[] arr,int n) {
		int x=1;
		int y=0;
		if(n!=0) {
			if(n%2==0) {
				y=n;
			}
			else {
				y=n-1;
			}
			for(int i=0;i<=(n-1)/2;i++) {
				arr[i] = x;
				x+=2;
			}
			for(int i=(((n-1)/2)+1);i<n;i++) {
				arr[i] = y;
				y-=2;
			}
		}
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
			ArrangeNum(arr,n);
			display(arr);
			t--;
			}
	}
}
