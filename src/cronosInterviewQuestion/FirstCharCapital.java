package cronosInterviewQuestion;

public class FirstCharCapital {

	public static void main(String[] args) {
		

		String S = "new world selenium automation";
		
		String Capital = " ";
		String[]splitted= S.split(" ");
		
		for (String a: splitted)
		{
			
		String AfterFirstLetter =a.substring(1);
		
		String First = a.substring(0, 1);
		
		Capital = Capital+First.toUpperCase()+AfterFirstLetter+" ";
		
		}
		
		System.out.println(Capital);
		

	}

}
