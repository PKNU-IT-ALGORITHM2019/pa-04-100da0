package assignment03;

import java.util.Arrays;

public class librarysort {
	
	static double lib(int[]A) {
		long start = System.currentTimeMillis();
		Arrays.sort(A);
		long end = System.currentTimeMillis();
		return ((end - start)/1000.0);
	}
	
}
