package Strings_questions;

public class Print_substrings_using_function {

	public static void main(String[] args) {

         String s="abcd";
         for(int i=0;i<s.length();++i) {
        	 for(int j=i+1;j<=s.length();++j) {
        		 System.out.println(s.substring(i, j));
        	 }
         }
         
         String s1="hello";                //addition of strings
         String s2="world";
         String s3=s1+s2;
         System.out.println(s3);
         
         
         System.out.println("hello" +10 +20);
         System.out.println( 10 + 20 + "hello");
         
         
         String s4="abc def ghi jkl mno";               //split function
         String parts[]=s4.split(" ");
         for(int i=0;i<parts.length;++i) {
        	 System.out.println(parts[i]);
         }
	}

}
