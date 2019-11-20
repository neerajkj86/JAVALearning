package cronosInterviewQuestion;

public class LargestElementArray {

	public static void main(String[] args) {
		
		int a [] = {23,54,65,12,1,2};
		
		int max = a[0];
		
		for (int i=1;i<a.length;i++)
		{
			if (a[i]> max)
			max = a[i];
			
		}
		
		System.out.println("Largest element is "+max);

	}

}
