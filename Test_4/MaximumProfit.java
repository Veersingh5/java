package Test_4;
import java.util.Scanner;
import java.util.Arrays;
public class MaximumProfit {
    static Scanner s = new Scanner(System.in);
    public static int maximumProfit(int budget[], int index) {
		Arrays.sort(budget);
		int ans = Integer.MIN_VALUE;
		int n = budget.length;
		for(int i=0;i<n;i++) {
			ans = Math.max(ans, budget[i]*(n-i));
		}
		return ans;
	}
	public static int maximumProfit(int budget[]) {
		// Write your code here
		return maximumProfit(budget, budget.length-1);
	}
    public static void main(String[] args) {
        int index_size = s.nextInt();
        int budget[] = new int[index_size];
        for(int i=0;i<index_size;i++) {
            budget[i] = s.nextInt();
        }
        System.out.println(maximumProfit(budget));
    }
}
