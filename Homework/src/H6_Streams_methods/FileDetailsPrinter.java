package H6_Streams_methods;

import java.io.FileInputStream;
import java.io.IOException;

public class FileDetailsPrinter {
	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = new FileInputStream("D:\\Aurionpro\\Homework\\src\\H6_Streams_methods\\myFile");
		
		int ch;
		int characterCount = 0;
		int lineCount = 0;
		int wordCount = 0;
		int whiteCount = 0;
		
		while ((ch = fileInputStream.read()) != -1) {
			characterCount++;
			
			if (ch == '\n') {
				lineCount++;
			}
			
			else if (Character.isWhitespace(ch)) {
				wordCount++;
				whiteCount++;
				
			}
			
			
		}
		
		
		
		int countWithoutWhite = characterCount - whiteCount - lineCount;
		System.out.println("Number of characters without whitespace: " + countWithoutWhite);
		
		wordCount++;
		lineCount++;
		
		
		
		System.out.println("Number of characters with whitespace: " + characterCount);
		System.out.println("Number of words: " + wordCount);
		System.out.println("Number of lines: " + lineCount);
		
		fileInputStream.close();
	}

}
