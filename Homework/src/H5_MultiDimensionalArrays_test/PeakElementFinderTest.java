package H5_MultiDimensionalArrays_test;

import H5_MultiDimensionalArrays_methods.PeakElementFinder;
import java.util.Scanner;

public class PeakElementFinderTest {
	
	public static void main(String[] args) {
		
		PeakElementFinder arr = new PeakElementFinder();
		
		int[] array = arr.createArray();
		
		System.out.print("The peak elements with their indices are: ");
		
		arr.findPeakelements(array);
	}
	

}
