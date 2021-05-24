package Strings_questions;
import java.util.Scanner;

public class print_all_palindromic_substrings {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
	
		String str=s.next();
		solution(str);

	}
	
	public static void solution(String str) {
		for(int i=0;i<str.length();++i) {
			for(int j=i+1;j<=str.length();++j) {
				
				String substr=str.substring(i, j);
				
				if(isPalindrome(substr)==true) {
					System.out.println(substr);
				}
			}
		}
	}
	
	public static boolean isPalindrome(String substr) {
		int i=0;
		int j=substr.length()-1;
		while(i<=j) {
			char ch1=substr.charAt(i);
			char ch2=substr.charAt(j);
			
			if(ch1!=ch2) {
				return false;
			}
			else {
				i++;
				j--;
			}
			
		}
		return true;
	}

}
