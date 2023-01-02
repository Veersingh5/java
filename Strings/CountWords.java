package Strings;
import java.util.Scanner;
public class CountWords {
    public static int countWords(String str) {	
		if(str.length()==0) {
			return 0;
		}
		int space = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				space++;
			}
		}
		return space +1;
	}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		if (str != null) {
			str = str.trim();
		} else {
			str = "";
		}
		int count = countWords(str);
		System.out.println(count);
	}
}
