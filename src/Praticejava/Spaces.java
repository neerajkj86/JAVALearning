package Praticejava;

public class Spaces {

	public static void main(String[] args) {
		
		
		String S = "Hello India";
		
		char [] chars=S.toCharArray(); //convert string into array
		
		System.out.println(chars.length);
		
String s1 = "";


for (int i =0;i<chars.length;i++)
{
	
	if (chars[i]!= ' ' )
	{
		s1= s1+chars[i]; //append  the string if there is no space
	}
}

System.out.println(s1);
		
		

	}

}
