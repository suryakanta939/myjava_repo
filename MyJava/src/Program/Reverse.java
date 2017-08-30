package Program;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		System.out.println("enter a no");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int n1=n;
		int rev=0;
		int r=0;
	    while(n!=0){
			 r=n%10;
			 rev=rev*10+r;
			n=n/10;
			
	    }
	    System.out.println(rev);
	    if(n1==rev){
	    	System.out.println("its a palliondrom");
	    }
	    else{
	    	System.out.println("its not a palliondrom");
	    }
	}
	
}
