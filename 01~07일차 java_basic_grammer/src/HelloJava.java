import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class HelloJava {

	private static char[] file_reader;

	public static void main(String[] args) {
		File file=new File("C:\\Users\\UserK\\eclipse-workspace\\01일차");
		try {
			FileReader file_reader=new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(file_reader);
		}
	}

}
