package problems;

import org.junit.Test;

public class ReverseString2 {

	@Test
	public void test1() {
		reverseString("RaceCare");

	}

	@Test
	public void test2() {
		reverseString("0Live");

	}

	@Test
	public void test3() {
		reverseString("");

	}

	private void reverseString(String a) {

		int len = a.length();
		String res = "";

		for (int i = len - 1; i >= 0; i--) {
			res = res + a.charAt(i);

		}
		System.out.println(res);

	}

}
