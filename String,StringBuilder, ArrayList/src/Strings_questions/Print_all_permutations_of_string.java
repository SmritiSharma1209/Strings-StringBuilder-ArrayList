package Strings_questions;

import java.util.Scanner;

public class Print_all_permutations_of_string {

	public static void main(String[] args) {
		 Scanner s= new Scanner(System.in);
			
			String str=s.next();
			int n=str.length();
			int fact=factorial(n);
			
			
			for(int i=0;i<fact;++i) {
			   StringBuilder sb =new StringBuilder(str);
				int temp=i;
				
				for(int div=n; div>=1;--div) {
				   int q=temp/div;
				   int r=temp%div;
				
				  System.out.print(sb.charAt(r));
				  sb.deleteCharAt(r);
				  temp=q;
				
			}
			System.out.println();

	}
	}
	
	public static int factorial(int n) {
		int val=1;
		for(int i=2;i<=n;++i) {
			val=val*i;
	  }
		return val;
	}

}
