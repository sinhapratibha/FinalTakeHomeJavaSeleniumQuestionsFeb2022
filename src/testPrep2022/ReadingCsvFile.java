package testPrep2022;



import java.io.BufferedReader;
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingCsvFile {

	public static void main(String[] args)throws IOException {

		String path = "C:\\Users\\Pratibha\\PS-Selenium-eclipse-workspace\\testPrep2022\\src\\testPrep2022\\dictionaryWords.csv";
		String line = "";

		// ask the user to enter the file path
		System.out.println("Please enter the dictionary file path");

		// accept the input 
		Scanner ui = new Scanner(System.in);
		String filePath = ui.nextLine();
		System.out.println(filePath);

		if (filePath.equals(path)) 
		{

			try {
				// Create a Buffered Reader for my file.
				BufferedReader br = new BufferedReader(new FileReader(filePath));

				// While the next line isn't null
				while ((line = br.readLine()) != null) {

					// Split the string by commas and store in a new array.
					String[] words = line.split(",");

					// print each entry in a separate line, repeat until end of array.
					// alternate for loop:
					// for (String word : words) {
					// 	System.out.println(word);
					// }
					for (int i = 0; i <= (words.length -1); i++) {
						System.out.println(words[i]);
					}
					System.out.print("\n");

				}
				br.close();
			} catch (FileNotFoundException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();

			}
		}
		ui.close();
	}
}

