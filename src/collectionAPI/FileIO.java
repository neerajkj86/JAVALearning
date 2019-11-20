package collectionAPI;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) throws IOException {
		
		File f = new File ("C:\\New folder\\ABC.txt"); //chaining 
		
		FileWriter fw = new FileWriter(f, true);
		
		BufferedWriter writer = new BufferedWriter(fw);
		
		writer.write("First Line");
		writer.newLine();
		writer.write("Rajasthan");
		writer.newLine();
		writer.write("Misti Jain");
	
		writer.close();
		
		System.out.println("File Created");
		
	}

}
