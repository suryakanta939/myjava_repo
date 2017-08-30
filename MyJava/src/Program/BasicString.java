package Program;

public class BasicString {

	public static void main(String[] args) {
		String s=new String("ashwini");
		System.out.println(s);
		String s1=" medhagowda ";
		String s2="congradulation";
		System.out.println(s1);
		System.out.println(s.compareTo(s1));
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.charAt(4));
		System.out.println(s1.indexOf('a'));
		System.out.println(s.indexOf("i", 5));
		System.out.println(s.contains("lal"));
		System.out.println(s.concat(s1));
		String[] st=s2.split("g");
		System.out.println(st[1]);
		System.out.println(s.replace("a", "k"));
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++){
			System.out.println(ch[i]);
		}
		System.out.println(s1.length());
		String s3=s1.trim();
		System.out.println(s1.trim());
		System.out.println(s3.length());
	}

}
