package oopsconcepts;

public class CapitalizeEachWord {

	public static void main(String[] args) {
		
		String s = "Hello World";
		
		//String S1 =s.substring(0, 2); //end is skipped
		
		//String S1 = s.substring(1);
		
		//System.out.println(S1);
		
		
		String [] a =s.split(" ");

				for (String p: a)
				{
					System.out.println(p);
				}
	}

}
