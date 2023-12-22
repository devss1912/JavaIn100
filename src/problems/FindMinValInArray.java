package problems;

import org.junit.Test;

public class FindMinValInArray {

	public int[] a1 = { 0, -3, 3, 11, 4, 2, -4, 5, 11, 13, 4 };
	public int[] a2 = {};
	public int[] a3 = { 1, 1, 1, 1, 1, 1, 1 };
	public int[] a4 = { 0, 1, 1, 1, 1 };

	@Test
	public void postive() {
		findMinValInArray(a1);
	}

	@Test
	public void postive2() {
		findMinValInArray(a2);

	}

	@Test
	public void postive3() {
		findMinValInArray(a3);
	}

	@Test
	public void postive4() {
		findMinValInArray(a4);

	}

	public static void findMinValInArray(int[] array) {

		int[] myArray = array;
		int len = myArray.length;
		System.out.println("lenght is " + len);
		
		if (len > 0) {
			int min = myArray[0];
			for (int i = 1; i < len; i++) {
				if (myArray[i] < min) {
					min = myArray[i];}
			}
			System.out.println("min valus is " + min);
		}else			
			System.out.println("array is empty");
		}
	}

