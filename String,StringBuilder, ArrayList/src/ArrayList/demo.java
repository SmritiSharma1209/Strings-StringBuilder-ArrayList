package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1=new ArrayList<>();
		
		a1.add(10);               //adding values
		a1.add(20);
		a1.add(30);
		System.out.println(a1);
		
		
		a1.add(2,1200);
		System.out.println(a1);   //append;
		
		
		a1.remove(0);
		System.out.println(a1);      //remove
		
		System.out.println(a1.get(1));     //get
		
		System.out.println(a1.size());     //size

		
		for(int i=0;i<a1.size();++i) {
			System.out.println(a1.get(i));  //loop
		}
		

	}

}
