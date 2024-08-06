package H6_Streams_test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class POCFile {
	public static void main(String[] args) throws IOException {

		FileInputStream fileInputStream = new FileInputStream(
				"D:\\Aurionpro\\Homework\\src\\H6_Streams_methods\\myFile");

		int ch;

		System.out.println("\n.equals()");
		System.out.println(fileInputStream.equals("D:\\Aurionpro\\Streams\\src\\InputAndOutput\\myFile"));

		System.out.println("\n.markSupported()");
		System.out.println(fileInputStream.markSupported());
		
//		System.out.println("\n.mark()");
//		fileInputStream.mark(10);
		
		System.out.println("\n.available()");
		System.out.println(fileInputStream.available());
		
		FileOutputStream fileOutputStream = new FileOutputStream("D:\\Aurionpro\\Homework\\src\\H6_Streams_methods\\myFile2");
		
		System.out.println("\n.read()");
		while ((ch = fileInputStream.read()) != -1) {
			
			System.out.print((char)ch);
		}
		
//		fileInputStream.reset();
//		System.out.println("\n.available()");
//		System.out.println(fileInputStream.available());
//		while ((ch = fileInputStream.read()) != -1) {
//				
//			System.out.print((char)ch);
//		}
		

		fileInputStream.close();
		
		
	}
}


