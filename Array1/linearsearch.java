package CodingNinjas.Array1;
import java.util.Scanner;
public class linearsearch {
    public static int linearSearch(int arr[], int x) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == x) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t!=0 && 1<=t && t<=100) {
			int n = s.nextInt();
			int[] arr = new int[n];
			
			for (int i=0;i<n;i++) {
				arr[i] = s.nextInt();		
				}
			int x = s.nextInt();
			System.out.println(linearSearch(arr,x));
			t--;
		}
}
}