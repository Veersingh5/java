package Array1.Assignment;
import java.util.Scanner;
public class FindDuplicate {
	static Scanner s = new Scanner(System.in);
    public static int duplicateNum(int[] arr) {
		int k=0;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			int temp = arr[i];
			if(count==0) {
				for(int j=i+1;j<arr.length;j++) {
					if(temp==arr[j]) {
						count =1;
						k=arr[i];
						break;
					}
				}
			}
		}
		return k;
	}

		public static void main(String[] args) {
			int t = s.nextInt();
			while(t!=0 && 1<=t && t<=100) {
				int n = s.nextInt();
				int[] arr = new int[n];
				
				for (int i=0;i<arr.length;i++) {
					arr[i] = s.nextInt();		
					}
				System.out.println(duplicateNum(arr));
				t--;
			}
		}
}
