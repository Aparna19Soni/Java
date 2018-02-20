import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author Aparna This is to read myfile and print it's content in program
 *
 */
public class Application {

	public static void main(String[] args) {
		/*
		 * Scanner input = new Scanner(System.in);
		 * System.out.println("enter some text: "); String enteredText =
		 * input.nextLine(); System.out.println(enteredText);
		 */
		try {
			File file = new File("C://Users/IBM_ADMIN/Desktop/Personal git/Java/ProcessingFiles/myfile");
			Scanner input;

			input = new Scanner(file);

			while (input.hasNextLine()) {
				String line = input.nextLine();
				System.out.println(line);
			}
			input.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			//e.printStackTrace();
		}
		
		MyFileUtils mft = new MyFileUtils();
		try {
			mft.subtract10FromLargerNumber(9);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
