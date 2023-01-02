package Strings;

import java.util.Scanner;

public class removeDuplicates1 {
    static Scanner s = new Scanner(System.in);
    public static String removeDups(String s) {
        if(s == null || s.length() <= 1) return s;
        boolean[] hit = new boolean[256];
        int len = s.length();
        String res = "";
        for( int i = 0 ; i < len ; i++) {
            if(hit[(int)s.charAt(i)]) {
                continue;
            }
            else {
                hit[(int)s.charAt(i)] = true;
                res += s.charAt(i);
            }
            int n = res.length();
        }
        return  res;
        }
    public static void main(String[] args) {
        String str = s.nextLine();  
        System.out.println(removeDups(str).length());
        }
}
