package Array1.Assignment;
import java.util.Scanner;
public class IntersectionOfTwoArray {
	static Scanner s = new Scanner(System.in);
    public static void intersections(int arr1[], int arr2[]) {
        boolean intersect[] = new boolean[arr2.length];
        for(int i=0;i<arr1.length;i++) {
            int temp=arr1[i];
            for(int j=0;j<arr2.length;j++) {
                if(intersect[j] == false) {
                    if(temp==arr2[j]) {
                        intersect[j] = true;
                        System.out.print(temp+ " ");
                        break;
                    }
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

	public static void main(String[] args) {
		int t = s.nextInt();
		while(t!=0) {
			int[] arr1 = takeInput();
			int[] arr2 = takeInput();
			
			intersections(arr1,arr2);
			t--;
		}

	}
}
