package Program;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int sum=0;
		int value=0;
		String mobno="906654982301230484688235";
		char[] c=mobno.toCharArray();
		int len=c.length;
		for(int i=1;i<=len;i++){
			if(i%2==0){
				char no=c[i-1];
				 value=Integer.parseInt(String.valueOf(no));
				System.out.println(value);
				sum=sum+value;
			}
		}
		System.out.println("the sum of the even no positioned value is "+sum);
		
		}
	
	}


