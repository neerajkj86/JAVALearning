package cronosInterviewQuestion;

public class ReversrNumber {

	public static void main(String[] args) {
		
		int n = 121;
		int temp = n;
		int r;
		int rev=0;
		while (n>0)
		{
		r= n%10; // give me the remainder which is 4 first then 3
		n = n/10; //123 //12
		rev = rev*10+r; //rev = 0+4 = 4 // 4*10+3=43  
			
		}
		
		System.out.println(rev);
		
		if (rev == temp )
		{
			System.out.println("Number is palindormme ");
		}
		else 
			System.out.println("Numbr is not Palindrome");
	}

}
