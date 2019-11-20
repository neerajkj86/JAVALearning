import java.util.HashSet;

/**
 * @author JainNe
 * How to remove the duplicate words in a given string "India" ?
 *
 *
 */
public class Newlearning {

	
	
	public static void main(String[] args) {
		
		String s = "India";
		char[] c=s.toLowerCase().toCharArray();
		
		HashSet<Character> set=new HashSet<Character>();
		
		
		for(Character ch:c) {
		
			set.add(ch);
		}
		s="";
		for(Character temp:set) {
		s=s+temp;
		}
		System.out.println(s);

	}

}
