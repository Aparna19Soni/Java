	import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

	public class ApplicationWithJava7 {

		public static void main(String[] args) {
			File file = new File("C://Users//IBM_ADMIN//Desktop//Personal git//Java//ProcessingFiles1//myFile");
			try (FileReader fileReader = new FileReader(file);
					BufferedReader bufferedReader = new BufferedReader(fileReader);){
				
				String line = bufferedReader.readLine();
				while(line != null)
				{
					System.out.println(line);
					line = bufferedReader.readLine();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Problem reading the file"+file.getName());
				e.printStackTrace();
			}
			
		}

	}



