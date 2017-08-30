package Program;

public class countchara {

	public static void main(String[] args) {
		String s="suryakantasahoo";
		int count=0;
		char c='a';
		for(int i=0;i<s.length();i++){
			char c1=s.charAt(i);
			if(c==c1){
				count++;
			}
			
		}
      System.out.println(count);
	}

}
