package Strings_questions;

import java.util.Scanner;

public class String_with_diff_of_consecutive_char {

	public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
		
		String str=s.next();
		
		String newstr=diff_char(str);
		System.out.println(newstr);
	
	
	}
	
		public static String diff_char(String str) {
		String newstr=""+str.charAt(0);
		for(int i=1;i<str.length();++i) {
			int curr=str.charAt(i);
			int prev=str.charAt(i-1);
			char ch=str.charAt(i);
			
			int diff=curr-prev;
			newstr=newstr+diff+ch;
			
			}
		return newstr;

       }
}
