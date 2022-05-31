package Strin;

public class RevWord {

	public static void main(String[] args) {
		
		
		String s1="Hello how are you";
		String s2[]=s1.split(" ");
		String s3=" ";
	for (int i = s2.length-1; i >=0 ; i--) {
		
		s3=rev(s2[i])+" "+s3;
	}
	System.out.println(s3);
	}
	public static String rev(String s) {
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			s1=s.charAt(i)+s1;
		}
		s1=s1.trim();
		return s1;
	}

}
