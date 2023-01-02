package Strings.Assignment;
import java.util.Scanner;
public class removeDuplicates {
    static Scanner s = new Scanner(System.in);
    public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
		int n = str.length();
		if (n == 0) { 
			return str;
		}
		String result = ""; 
		int Index = 0;
		while (Index < n) {
			char UniqueChar = str.charAt(Index);
			int Char = Index + 1;
			while (Char < n && str.charAt(Char) == UniqueChar) {
				Char++;
			}
			result = result + UniqueChar;
			Index = Char;
		}
        int a= str.length();
		return result;
	}
    public static void main (String [] args) {
		String str = s.nextLine();
		if (str != null) {
			str = str.trim ();
		} else {
			str = "";
		}

		String ans = removeConsecutiveDuplicates(str);

		System.out.println(ans);
		
	}
}
