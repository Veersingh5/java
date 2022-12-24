package Test_4;
import java.util.Scanner;
public class SplitArray {
    static Scanner s = new Scanner(System.in);
    public static boolean splitArray(int input[], int startIndex, int leftSum, int rightSum) {
		if(startIndex == input.length) {
			return leftSum == rightSum;
		}
		if(input[startIndex] %5 == 0) {
			leftSum += input[startIndex];
		}
		else if(input[startIndex] %3 == 0) {
			rightSum += input[startIndex];
		}
		else {
			return splitArray(input, startIndex + 1, leftSum + input[startIndex], rightSum) || splitArray(input, startIndex+1, leftSum, rightSum + input[startIndex]);
		}
		return splitArray(input, startIndex + 1, leftSum, rightSum);
	}
	public static boolean splitArray(int input[]) {
		/* Your class should be named solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		return splitArray(input, 0, 0, 0);
	}
    public static void main(String[] args) {
        int index_size = s.nextInt();
        int[] input = new int[index_size];
        for(int i=0;i<index_size;i++) {
            input[i] = s.nextInt();
        }
        System.out.println(splitArray(input));
    }
}
