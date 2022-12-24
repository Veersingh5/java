package Recursion2;
import java.util.Scanner;
public class MergeSort {
    static Scanner s = new Scanner(System.in);
    public static void mergeSort(int input[]) {
        if (input.length <= 1) {
			return;
		}
		int midIndex = input.length / 2;
		int[] side1 = new int[midIndex];
		int[] side2 = new int[input.length - midIndex];
		for (int i = 0; i < midIndex; i++) {
			side1[i] = input[i];
		}
		int k = 0;
		for (int i = midIndex; i < input.length; i++) {
			side2[k] = input[i];
			k++;
		}
		mergeSort(side1);
		mergeSort(side2);
		merge(input, side1, side2);
	}
	
	public static void merge(int[] input, int side1[], int side2[]) {
		int i = 0, j = 0, k = 0;
		while (i < side1.length && j < side2.length) {
			if (side1[i] < side2[j]) {
				input[k] = side1[i];
				k++;
				i++;
			}
			else {
				input[k] = side2[j];
				k++;
				j++;
			}
		}
		while (i < side1.length) {
			input[k] = side1[i];
			k++;
			i++;
		}
		while (j < side2.length) {
			input[k] = side2[j];
			k++;
			j++;
		}
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
		mergeSort(input);
		printArray(input);
    }
}

