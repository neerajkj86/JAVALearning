package abstractdemo;

public class SwapString {

	public static void main(String[] args) {
	
		String a = "Hello";
				
		String b = "World";
		
		//a= a+b;
		
		a =a.replaceAll("[^a-zA-Z0-9]", "");  // [a-zA-Z0-9]
		
		///System.out.println(a); //ame logic we apply in integer we use here for string swapping
		
		//b = a.substring(0,5);
		
		b = a.substring(0,a.length()-b.length());
		a = a.substring(b.length());
		
		System.out.println(a+"-----"+b);
		
		
		
	}

}
