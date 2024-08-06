package InputAndOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOSWriter {
	public static void main(String[] args) throws IOException {

		FileInputStream fileInputStream = new FileInputStream("D:\\Aurionpro\\Streams\\src\\InputAndOutput\\myFile");

		int ch;
		
		FileOutputStream fileOutputStream = new FileOutputStream("D:\\Aurionpro\\Streams\\src\\InputAndOutput\\myFile2");
		while ((ch = fileInputStream.read()) != -1) {
			fileOutputStream.write(ch);

		}
		
		
		fileInputStream.close();

	}

}
