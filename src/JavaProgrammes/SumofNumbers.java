package JavaProgrammes;

public class SumofNumbers {

	public static void main(String[] args) {
		
		String S = "Neeraj123"; //String literals
		
		String onlydigtis = S.replaceAll("[a-zA-Z]", "");
		
		System.out.println(onlydigtis);
		
		int sum =0;
		
		char[]a =onlydigtis.toCharArray();
		
		System.out.println(a);
		
		for (char b:a)
		{
			sum = sum+b;
		}
		
		System.out.println("sum of all the integer is" +sum);
		
		
	}

}
