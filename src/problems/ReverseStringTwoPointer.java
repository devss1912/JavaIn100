package problems;

import java.util.Arrays;

public class ReverseStringTwoPointer {

	public static void main(String[] args) {

		String myString = "RaceCarp";
		String myString2 = myString.toLowerCase();
		System.out.println(myString2);
		
//		char[] myArray = myString.toCharArray();
//		int right = myArray.length - 1;
//		int left = 0;
		// char temp ;
		// while(left <= right) {
		// temp = myArray[left];
		// myArray[left] = myArray[right];
		// myArray[right] = temp;
		// left++;
		// right--;
		// }
		//
		// String resStr = new String(myArray);
		// System.out.println(resStr);
		// System.out.println(Arrays.toString(myArray));

		// palindrome
		char[] myArray2 = myString2.toCharArray();
		int right = myArray2.length - 1;
		int left = 0;
		
		boolean flag = false;
		while (left <= right) {
			if (myArray2[left] != myArray2[right]) {
				flag = false;
			} else {
				flag = true;
			}

			left++;
			right--;
		}
		if (flag) {
			System.out.println("palindorm");
		} else {
			System.out.println("Not palindrom");
		}

	}

}
