package abstractdemo;

public class StringBasics {

	public static void main(String[] args) {
		
		String s1 = "Seleni#%u@m Automation Testing";
		
		String s2 = "selenium Automation testing";
		
		int len=s1.length();
		
		System.out.println(len);
		
		s1.charAt(0);
		
		System.out.println(s1.charAt(0));
		
		//for (int i=len-1)
		
//		boolean B= s.contains("eniu");
//		
//		System.out.println(B);
//		
//		boolean B= s.startsWith("sel");
//				
//		System.out.println(B);
		
		
//		boolean B = s.endsWith("um");
//				
//		System.out.println(B);

		//Boolean B=s1.equals(s2);
		
//		Boolean B = s1.equalsIgnoreCase(s2);
//		System.out.println(B);
		
		String B=s1.concat( s2 );
		
		System.out.println(B);
		
	}

}
