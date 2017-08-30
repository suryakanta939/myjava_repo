package Program;

import java.util.Scanner;

public class CountAllCharacter {

	public static void main(String[] args) {
		int count=0;
		System.out.println("enter a string");
		Scanner scn=new Scanner(System.in);
		String msg=scn.next();
		char[] c=msg.toCharArray();
		char[] c1=msg.toCharArray();
		for(int i=0;i<c.length;i++){
			for(int j=1;j<c1.length;j++){
				if(c[i]==c1[j]){
					count++;
				}
			}
			System.out.println("the nosd of time "+c[i]+"is repeted "+count++);
		}
	}

}
