package Praticejava;

public class CountNumberSttring {

	public static void main(String[] args) 
	{
		
		String S = "New India is Shining";
		int count =0;
		for (int i=0;i<S.length();i++)
		{
			if (S.charAt(i) !=' ') {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
