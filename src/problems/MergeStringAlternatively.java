package problems;

import org.junit.Test;

public class MergeStringAlternatively {


	@Test
	public void test1 (String x, String y) {
		String ans = functionMerge("ans", "two");
		System.out.println(ans);
	}

	////	public static void main(String[] args) {

	public String functionMerge(String x, String y) {
		char c = ' ';
		String a = "one";
		String b = "two";

		int len = a.length()>b.length()? a.length() : b.length();
		System.out.println(len);
		return b;


	}



}
