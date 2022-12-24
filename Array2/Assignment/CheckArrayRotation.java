package CodingNinjas.Array2.Assignment;
import java.util.Scanner;
public class CheckArrayRotation {
    public static int arrayRotateCheck(int[] arr){
    	//Your code goes here
         int out = 0;
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return i+1;
            }
        }
        return out;
    }
    public static void display(int[] arr) {
		
		   System.out.println(arrayRotateCheck(arr));
	}
    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		
		while(t>0 && 1<=t && t<=100) {
			int[] arr = takeInput();
			display(arr);
			t--;
			}
	}
}
