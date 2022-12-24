package Recursion2;
import java.util.Scanner;
public class QuickSort {
    static Scanner s = new Scanner(System.in);
    public static void quickSort(int[] input) {
        quickSort(input, 0, input.length-1);
    }
    public static void quickSort(int[] input, int startIndex, int endIndex) {
        if(startIndex >= endIndex) {
            return;
        }
        int pivotpos = partition(input, startIndex, endIndex);
        quickSort(input, startIndex, pivotpos-1);
        quickSort(input, pivotpos+1, endIndex);
    }
    public static int partition(int input[],int startIndex,int endIndex){
        int pivotpos=input[startIndex];
        int smallerNumCount=0;
        for(int i=startIndex+1;i<=endIndex;i++){
            if(input[i]<pivotpos){
                smallerNumCount++;
            }
        }
        int temp=input[startIndex+smallerNumCount];
        input[startIndex+smallerNumCount]=pivotpos;
        input[startIndex]=temp;
        int i=startIndex;
        int j=endIndex;
        while(i<j){
            if(input[i]<pivotpos){
                i++;
            }else if(input[j]>=pivotpos){
                j--;
            }else{
                 temp=input[i];
                input[i]=input[j];
                input[j]=temp;
                i++;
                j--;
            }
        }
        return startIndex + smallerNumCount;
    }
    public static void printArray(int input[]) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
    public static void main(String[] args) {
        int size = s.nextInt();
        int[] input = new int[size];
        for(int i=0;i<size;i++) {
            input[i] = s.nextInt();
        }
		quickSort(input, 0, input.length-1);
		printArray(input);
    }
}
