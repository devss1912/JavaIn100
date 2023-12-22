package problems;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class TwoSum {

	@Test
	public void testPositive() {
		twoSum();
	}

	@Test
	public void testNegtive() {
		twoSumUsingHashMap();

	}

	@Test
	// Edge means - not a common scenario but it may occur
	public void testEdge() {

	}

	private void twoSum() {

		int[] ary = { 4, 1, 17, 2, 13, 5, 7 };
		int target = 20;
		int n = ary.length;

		for (int i = 0; i < n; i++) {

			for (int j = 1; j < n; j++) {
				if (ary[i] + ary[j] == target) {
					System.out.println("index" + i + " -> " + j);
				}

			}
		}
	}

	private void twoSumUsingHashMap() {

		int[] ary = { 4, 1, 17, 2, 13, 5, 7 };
		int target = 20;
		int n = ary.length;
		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();

		myMap.put(ary[0], 0);
		for (int i = 0; i < n; i++) {
			int x = target - ary[i];
			if (myMap.containsKey(x)) {
				// int val1 = myMap.get(x);
				System.out.println("index of val1 is " + myMap.get(x));
				System.out.println("index of val2 is " + i);
			} else {
				myMap.put(ary[i], i);
			}

		}

	}
}