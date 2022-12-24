package CodingNinjas.Array2;
import java.util.Scanner;
public class CodeBinarySearch {

    public static int binarySearch(int[] arr, int x) {
    	//Your code goes here
        int start = 0;
        int end = arr.length -1;
        while(start<=end) {
            int mid = (start+end)/2;
            if(x==arr[mid]) {
                return mid;
            }
            else if(x<arr[mid]) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int[] arr = new int[n];
			
			for (int i=0;i<n;i++) {
				arr[i] = s.nextInt();		
				}
            int t = s.nextInt();
            while(t!=0) {
			int x = s.nextInt();
			System.out.println(binarySearch(arr,x));
            t--;
            }
}
}

