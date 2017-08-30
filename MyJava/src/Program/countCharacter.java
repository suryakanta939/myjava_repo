package Program;

import java.util.Scanner;

public class countCharacter {
	
	public static void main(String[] args) {
		int count=0;
		System.out.println("enter a string");
		Scanner scn=new Scanner(System.in);
		String value=scn.next();
		//System.out.println("enter a the caharacter u want to check its repetation");
		char c1='a';
		for(int i=0;i<value.length();i++)
		{
			char c=value.charAt(i);
			if(c==c1){
				count++;
			}	
		}
		System.out.println("the no of time that character is present in that sentence is "+count++);
	}

}
