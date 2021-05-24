package ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class Remove_primes {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		ArrayList<Integer> a1=new ArrayList<>();
		
	
		
		for(int i=0;i<n;++i) {
			a1.add(s.nextInt());
		}
		
		for(int i=n-1;i>=0;--i) {
			int num=a1.get(i);
			int count=0;
			
			for(int j=2;j<=Math.pow(num, 0.5);++j) {
				if(num%j==0) {
					count++;
					break;
				}
				
			}
			if(count==0) {
				a1.remove(i);
			}
		}
		
		System.out.print(a1);
	}

}
