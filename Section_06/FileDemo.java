import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;

public class FileDemo
{
	public static void main(String[] args) throws Exception
	{
		// Declare input filestream object
		File inFile=new File("input.txt");
		
		// Define and create Scanner object
		Scanner in=new Scanner(inFile);
		
		// Read data from input file
		int i=in.nextInt();
		float f=in.nextFloat();
		String s=in.next();
		
		in.close();
		
		// Display the data in memory
		System.out.println(i);
		System.out.println(f);
		System.out.println(s);
		
		// Declare output filestream object
		File outFile=new File("output.txt");
		
		// Define and create PrintWriter object
		PrintWriter out=new PrintWriter(outFile);

		// Write data to output file
		out.println(i*2);
		out.println(f*3);
		out.println(s+s);

		out.close();
	}
}