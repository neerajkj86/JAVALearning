package abstractdemo;

public class SwapNumber3 {

	public static void main(String[] args) {
	
		int a=5; //101
		int b=4;   //100
		
		
		a=a^b;  //1 0 1 XOR 1 0 0 = 001
		b=a^b;  //0 0 1 XOR 1 0 0 = 101
		a=a^b;  //0 0 1 XOR 1 0 1 = 100
		
		
		System.out.println(a);
		
		System.out.println(b);

	}

}
