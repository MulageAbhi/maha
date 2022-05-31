package Strin;

public class Vowel {

	public static void main(String[] args) {
	/*	String s1="why is sky blue";
		char a;
		String s2[]=s1.split(" ");
		String s3=" ";
		String s4[] = null;
		//System.out.println(s3);
		for (int i = 0; i < s2.length; i++) {
			
			s3=s2[i];
			a=s3.charAt(i);
			if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
				s4[i]=s2[i];
			
		}
		*/
		String s1="why is sky blue";
		String s2[]=s1.split(" ");
		String s3=" ";
	for (int i = s2.length-1; i >=0 ; i--) {
		
		s3=vowel(s2[i])+" "+s3;
	}
	System.out.println(s3);
	}
	public static String vowel(String s) {
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
				s1=s;
		}
		s1=s1.trim();
		return s1;
	}

}
