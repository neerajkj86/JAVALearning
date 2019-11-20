package genapctHeadstrongInterview;

public class DuplicateinArray2 {

	public static void main(String[] args) {
	
		String a [] = {"Java","Selenium","Java"};
		
		for (int i =0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if (a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}

	}

}
