package problems;

import org.junit.Test;

public class AddNumberGivenBetweenAlphabetsTotal {

	@Test
	public void test1() {
		printChar("a4b3c2");

	}

	@Test
	public void test2() {
		printChar("z4d2x0p9S2");
	}

	@Test
	public void test3() {
		printChar("a2");
	}

    // Converting the character to it's integer value
    // using valueOf() method
//	char c = a.charAt(j);
//    int a = Integer.parseInt(String.valueOf(c));
    
	private void printChar(String a) {
		int len = a.length();
		for (int j = 0; j < len; j++) {
			if (j == 0 || j %2 ==0) {
				char c = a.charAt(j+1);
				int l =  c- '0'	;  // 
//				System.out.println(l);
				for (int k = 0; k < l; k++) {
					System.out.print(a.charAt(j));
				}
			}
		}
	}
}
