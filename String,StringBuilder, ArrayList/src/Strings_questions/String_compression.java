package Strings_questions;

import java.util.Scanner;

public class String_compression {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		
		String str=s.next();
		String comp1=Compression1(str);
		System.out.println(comp1);
		String comp2=Compression2(str);
		System.out.println(comp2);
	}
	
	public static String Compression1(String str) {
		char maxe=str.charAt(0);
		String comp1=""+maxe;
		int i=0;
		while(i<str.length()) {
			if(maxe==str.charAt(i)) {
				i++;
			}else {
				comp1=comp1 + str.charAt(i);
				maxe=str.charAt(i);
				i++;
			}
		}
		return comp1;
		
}
	
	public static String Compression2(String str) {
		String comp2 = str.charAt(0)+"";
		int count=1;
		for(int i=1;i<str.length();++i) {
			char curr=str.charAt(i);
			char prev=str.charAt(i-1);
			
			if(curr==prev) {
				count++;
			}
			else {
				if(count>1) {
					comp2+=count;
				}
				comp2+=curr;
				count=1;
			}
		}
		if(count>1) {
			comp2+=count;
		}
		
		return comp2;
		
		
	}

}
