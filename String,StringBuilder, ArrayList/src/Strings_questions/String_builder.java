package Strings_questions;

public class String_builder {

	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder("hello");
		
		
		char ch=sb.charAt(0);  //get
		System.out.println(ch);
		
		sb.setCharAt(0, 'd');   //set
		System.out.println(sb);
		
		
		sb.insert(2,'y');       //insert
		System.out.println(sb);
		
		sb.append('q');           //append
		System.out.println(sb);
		
		sb.deleteCharAt(4);
		System.out.println(sb);
		
		System.out.println(sb.length());
		
		 char n=97;
		System.out.print(n);
		
		
		
		
		
	}

}
