package genapctHeadstrongInterview;

public class FrequencyOfArrayelement {

	public static void main(String[] args) {
		
		
		int a [] = {3,5,6,7,3,5,7};
		
		int count =0;
		for (int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if (a[i]==a[j])
				{
					count ++;
					
					
				}
			}
		}

		System.out.println(count);
	}

}
