package CodingNinjas.Array2.Assignment;
import java.util.Scanner;
public class SecondLargestArray {
    public static int secondLargestElement(int[] arr) {
    	//Your code goes here
    int l = Integer.MIN_VALUE;
    int l2 = Integer.MIN_VALUE;
    for(int i = 0; i<arr.length; i++){
        if(arr[i]>l){
            l2 = l;
            l = arr[i];
        }
        else if(arr[i]>l2 && arr[i] != l){
            l2 = arr[i];
        }
    }
    return l2;
}
public static void display(int[] arr) {
       System.out.println(secondLargestElement(arr));
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
        display(arr);
        t--;
        }
}

}
