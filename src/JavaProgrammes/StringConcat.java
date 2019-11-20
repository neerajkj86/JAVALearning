package JavaProgrammes;

public class StringConcat {

	//Important: After a string literal, all the + will be treated as string concatenation operator.
	
	//Internally its calls String builder or buffer class to append the string 
	public static void main(String[] args) 
	{
		
		String S1 = "Neeraj1234" ;
		
		String S2 = "Neeraj";
		
	System.out.println(S1.concat(S2));
	
	
	System.out.println(S1+S2);
	
	String str = 20+30+"sachin"+30+20+"tendulkar"; //String Concat method will treat the string after String literals not before as we can see that 
	
	// beofore String literals its working a plus operator for primitive data types..
		
	System.out.println(str);
	
	System.out.println(S1.compareTo(S2));//it compare the unicode value of each characters
	
	System.out.println(S1.isEmpty());
	
	//char a[]=S1.toCharArray();
	
	System.out.println(S1.hashCode());
	
	for (int i=0;i<S1.length();i++)
	{
	Boolean b =Character.isDigit(S1.charAt(i));
	
	System.out.println(b);
	

	}
	}

}
 