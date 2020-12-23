import java.io.File;
import java.util.Scanner;

public class WordCount
{
	public static void main(String[] args) throws Exception
	{
		// Declare input filestream object
		File inFile=new File(args[0]);
		
		// Define and create Scanner object
		Scanner in=new Scanner(inFile);
		
		// Initial the counter
		int totalOfWords=0; // number of words in the file
		int count=0;		// number of the word (args[1]) in the file

		// Read data from input file
		while (in.hasNext())
		{
			String s=in.next(); // read a string from the file
			totalOfWords++;		// count the number of words

			if (s.equalsIgnoreCase(args[1]))
			{
				count++; 		// count the word - args[1]
			}
		}
		in.close();
		
		// Display the result in the file
		System.out.printf("Totally, there are %d words in the file: \"%s\",", totalOfWords, args[0]);
		System.out.printf(" and %d of word - \"%s\".\n", count, args[1]);
	}
}