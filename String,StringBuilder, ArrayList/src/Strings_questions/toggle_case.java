package Strings_questions;

import java.util.Scanner;

public class toggle_case {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		String str=s.next();
		String newstr=toggle(str);
		System.out.println(newstr);
		

	}
	
	public static String toggle(String str) {
		String newstr="";
		for(int i=0;i<str.length();++i) {
			char ch=str.charAt(i);
			
			if(ch>='a' && ch<='z') {
				int n=ch-32;
				ch=(char)n;
				newstr+=ch;
				
				
				}else {
					int n=ch+32;
					ch=(char)n;
					newstr+=ch;
					
				}
			
		}
		return newstr;
		
		
		
	}

}
