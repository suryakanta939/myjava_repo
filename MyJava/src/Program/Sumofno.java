package Program;

import java.util.Scanner;

public class Sumofno {

	public static void main(String[] args) {
		System.out.println("enetr a no");
		Scanner scn=new Scanner(System.in);
	            long no=scn.nextLong();
		long sum=0;
		while(no!=0){
			long r=no%10;
			sum=sum+r;
			no=no/10;
		}
		System.out.println("the sum of the no "+sum);
		int i=10;
		double j=i;
		System.out.println(j);
		
		int k=(int)j;
		System.out.println(k);
	}

}
