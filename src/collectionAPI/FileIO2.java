package collectionAPI;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO2 {

	public static void main(String[] args) throws IOException {
		
		File f = new File ("C:\\New folder\\neeraj.txt");
		
		FileWriter fw = new FileWriter(f);
		
		BufferedWriter writer = new BufferedWriter(fw);
		
		
		for (int i =1;i<4;i++ )
		{
		 for (int j =1;j<4;j++)
		 {
			 int num =(int)(Math.random());
			 writer.write(num+"\t");
			 
		 }
		
		
		}
		
		writer.newLine();
		System.out.println("File Created");
	}

}
