import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateUsingMap {

	public static void main(String[] args) {
		
		String S = " Java is Java and Testing is Testing";
		
		Map <String ,Integer> map = new HashMap<>();
		
	String []words=	S.split(" ");
		
	
	for (String word:words)
	{
		if (!map.containsKey(word))
		{
		map.put(word, 1);
		}

		else
		{
			map.put(word, map.get(word)+1);
		}
			
	}
	
	
	Set<String> keys = map.keySet(); 
		
		for (String key:keys)
		{
			if (map.get(key)>1)
			System.out.println("frequency of the key is "+key +" "+ map.get(key) );	
		}
		

	}

}
