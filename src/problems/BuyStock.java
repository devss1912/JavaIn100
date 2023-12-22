package problems;

import org.junit.Test;

public class BuyStock {

	public int[] a1 = { 7, 1, 5, 3, 6 };
	public int[] a2 = { 1, 100, 0 ,2,22,0,222};
	public int[] a3 = { 100, 1, 5, 3, 12, 4 };

	@Test
	public void postive() {
		buyStock(a1);
	}

	@Test
	public void postive2() {
		buyStock(a2);

	}

	@Test
	public void postive3() {
		buyStock(a3);
	}

	public static void buyStock(int[] array) {

		int[] myArray = array;
		int len = myArray.length;
		System.out.println("lenght of array is " + len);

		if (len > 0) {
			int min = myArray[0];
			int max = 0;
			int profit = 0;
			int minIndex = 0, maxIndex = 0;

			for (int i = 1; i < len; i++) {
				if (myArray[i] > min) {
					if (myArray[i] > max) {
						max = myArray[i];
						maxIndex = i;
						profit = max - min;
					}

				} else {
					min = myArray[i];
					minIndex = i;

				}
			}
			System.out.println("min valus is " + min);
			System.out.println("max valus is " + max);
			System.out.println("profit is " + profit);
			System.out.println("min index is " + minIndex);
			System.out.println("max index is " + maxIndex);

		} else
			System.out.println("array is empty");
	}
}
