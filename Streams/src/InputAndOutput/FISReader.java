package InputAndOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FISReader {

	public static void main(String[] args) throws IOException {

		FileInputStream fileInputStream = new FileInputStream("D:\\Aurionpro\\Streams\\src\\InputAndOutput\\myFile");

		int ch;
		while ((ch = fileInputStream.read()) != -1) {

			System.out.print((char) ch);
		}

		fileInputStream.close();

	}

}
