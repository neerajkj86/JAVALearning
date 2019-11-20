package Praticejava;

public class DuplicateArray2 {

	public static void main(String[] args) {
		
		String [] names = {"Java" , "Python","Ruby","Java Script" ,"Java"};
		
		for (int i=0;i<names.length;i++)
		{
			for (int j = i+1;j<names.length;j++)
			{
				if (names[i].equalsIgnoreCase(names[j]))
				{
					System.out.println("Duplicate value is "+names[i]);
				}
			}
		}
		

	}

}
