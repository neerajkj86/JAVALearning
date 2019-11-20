package praticeforInterview;

public class FetchOnlyIntegerfromString {

	public static void main(String[] args) {
	
		
		//How to fetch the number from the string
		String Str= "this is your Order number 123456";
		
		String Str1=Str.replaceAll("[^0-9]", "");
		
		System.out.println(Str1);
	}

}
