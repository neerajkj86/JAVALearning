package JavaProgrammes;

/**
 * @author JainNe
 *  A

Au

Aut

Auto

Autom

Automa

Automat

Automati

Automatio

Automation
 *
 *
 *
 *
 */
public class PatternInterview {

	public static void main(String[] args) 
	{
		
		String S = "Automation";
	char[]a=S.toCharArray();
		for (int i=0;i<S.length();i++)
		{
			for (int j=0;j<=i;j++)
			{
				System.out.print(a[j]);
			}
			
			System.out.println();
		}
		

	}

}
