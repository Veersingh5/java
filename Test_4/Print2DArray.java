package Test_4;
import java.util.Scanner;
public class Print2DArray {
    static Scanner s = new Scanner(System.in);
    public static void print2DArray(int input[][], int row, int n) {
        if(row==input.length-1)
        {
            for (int i = 0; i < input[0].length; i++) {
                System.out.print(input[row][i] + " ");
            }
        }else if(input.length>n+row)
        {
            for (int i = 0; i < input[0].length; i++) {
                System.out.print(input[row][i] + " ");
            }
            System.out.println();
            print2DArray(input, row, ++n);
        }else if(input.length==n+row)
        {
            print2DArray(input, ++row, 0);
        }
        }
        public static void print2DArray(int input[][]) {
            // Write your code here
            print2DArray(input, 0, 0);
        }
        public static int[][] takeinput() {
            int row = s.nextInt();
            int column = s.nextInt();
            int[][] arr = new int[row][column];
            if(row==0 && column==0) return arr;
            for(int i=0;i<row;i++) {
               for(int j=0;j<column;j++) {
                arr[i][j] = s.nextInt();
               }
            }
            return arr;
        }
        public static void main(String[] args) {
            int arr[][] = takeinput();
            print2DArray(arr);
        }
}