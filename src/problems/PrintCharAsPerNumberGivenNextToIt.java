package problems;

import java.util.*;

import org.junit.Test;

public class PrintCharAsPerNumberGivenNextToIt {

	
	@Test
	public void test1() {
		printChar("a12b8c99dd66dd3a0");
	}

	@Test
	public void test2() {
		printChar("z4d2x0p9S2");
	}

	@Test
	public void test3() {
		printChar("a2b1");
	}

	// Create an empty string temp and an integer sum.
	// Iterate over all characters of the string.
	// If the character is a numeric digit add it to temp.
	// Else convert temp string to number and add it to sum, empty temp.
	// Return sum + number obtained from temp.
	// if (c > 47 && c < 58) {
	// System.out.println(c)
	private void printChar(String a) {
		int len = a.length();
		int sum = 0;
		String tmp = "0";
		char c;

		for (int j = 0; j < len; j++) {
			c = a.charAt(j);
			if (Character.isDigit(c)) {
				tmp = tmp + c;
			} else {
				sum = sum + Integer.parseInt(tmp);
				tmp = "0";
			}

		}
		System.out.println(sum + Integer.parseInt(tmp));
	}
}
