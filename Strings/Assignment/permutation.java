package Strings.Assignment;
import java.util.Scanner;
public class permutation {
    static Scanner s = new Scanner(System.in);
    public static boolean isPermutation(String str1, String str2) {
		//Your code goes here
		if(str1.length() != str2.length()) {
			return false;
		}
		int c[] = new int[256];
		for(int i=0;i<256;i++){
            c[i] = 0;
        }
        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
            c[ch]++;
        }
        for(int i=0;i<str2.length();i++){
            char ch = str2.charAt(i);
            c[ch]--;
        }
        for(int i=0;i<256;i++){
            if(c[i] != 0){
                return false;
            }
        }
        return true;
	}
    public static void main(String[] args){
		String str1 = s.nextLine();
		if (str1 != null) {
			str1 = str1.trim();
		} else {
			str1 = "";
		}

		String str2 = s.nextLine();
		if (str2 != null) {
			str2 = str2.trim();
		} else {
			str2 = "";
		}

		boolean ans = isPermutation(str1, str2);
		System.out.println(ans);
		
	}
}
