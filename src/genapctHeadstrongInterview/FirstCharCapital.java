package genapctHeadstrongInterview;

public class FirstCharCapital {

	public static void main(String[] args) {
		
		
		String S = "new world selenium automation";
		
		String Capitalworld = " ";
		String[]a=  S.split(" ");
		
		for (String n: a)
		{
			String First = n.substring(0, 1);
			String AfterFirst = n.substring(1);
            Capitalworld+=	First.toUpperCase()+AfterFirst+" ";	
			
			//Capitalworld = Capitalworld+First.toUpperCase()+AfterFirst+" ";
		}
		
		
		System.out.println(Capitalworld.trim());
		
		
		
		
		

	}

}
