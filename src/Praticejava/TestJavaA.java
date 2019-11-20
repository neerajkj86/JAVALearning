package Praticejava;

public class TestJavaA {

	public static void main(String[] args) {
		
		String s ="ABC3546abc123abc43634abc78326abc7685";
		System.out.println((s.length()-s.replace("abc", "").length())/"abc".length());

	}

}
