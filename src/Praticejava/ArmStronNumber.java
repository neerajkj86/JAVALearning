package Praticejava;

public class ArmStronNumber {

	
	//what is Armstrong Number -- lets say 153 1*1*1+5*5*5+3*3*3 =153 then it will be a armstrong number
	
	public static void ArmstrongNum(int n)

	{
		
        int temp = n;
		int r =0;
		
		int cube = 0;
		
		
		while(n>0) {
			
			r = n%10; //this willl give the reminder 
			cube = cube +r*r*r;
			n= n/10;
			
			
		}
		
		if (temp ==cube) {
			System.out.println("this is armstrong number");
		}
		
		else {
			System.out.println("this is not armstrong number");	
		}
	}
		
	
	
public static void main(String[] args) {
		
		// 153 = 1*1*1+5*5*5+3*3*3
		
		ArmstrongNum(1);
		
		
	}
	
		
		
		
		
		
		
		
		
		

	

}
