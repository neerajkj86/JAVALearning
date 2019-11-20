package praticeforInterview;

public class ArrayMaxNumbers {

	
	
public static void printTwoMaxNumbers(int[] nums){
        int maxOne = 0;
        int maxTwo = 0;
        for(int n:nums){
            if(maxOne < n){
                maxTwo = maxOne;
                maxOne =n;
            } else if(maxTwo < n){
                maxTwo = n;
            }
	
        }
        
        System.out.println("First Max Number: "+maxOne);
        System.out.println("Second Max Number: "+maxTwo);
}

	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		int num[] = {5,34,78,210,45,1,99,23};
		printTwoMaxNumbers(num);
		
		
	}

}
