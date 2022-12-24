package Test_4;
import java.util.Scanner;
public class MinimumCount {
    static Scanner s = new Scanner(System.in);
    public static int minCount(int n){
		/* Your class should be named Solution
	 	 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		*/
		int[] storage = new int[n+1];
		if(n<=3) {
			return n;
		}
		storage[0] = 0;
		storage[1] = 1;
		storage[2] = 2;
		storage[3] = 3;
		for(int i =4; i<=n;i++) {
			int result = i;
			for(int j=1; j<=Math.sqrt(i);j++) {
				result = Math.min(result, storage[i-j*j]+1);
			}
			storage[i] = result;
		}
		return storage[n];
	}
    public static void main(String[] args) {
        int N = s.nextInt();
        System.out.println(minCount(N));
    }
}
