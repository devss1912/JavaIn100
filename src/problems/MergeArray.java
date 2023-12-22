package problems;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class MergeArray {
	public int[] a1 = { 0, 3, 3, 11, 4, 2, -4, 5, 11, 13, 4 };
	public int[] a2 = {};
	public int[] a3 = { 1, 2, 3, 5 };
	public int[] a4 = { 0, 1, 81 };

	@Test
	public void testPositive() {
		MergeArray(a3, a4);
	}

	@Test
	public void testNegtive() {

	}

	@Test
	// Edge means - not a common scenario but it may occur
	public void testEdge() {

	}

	private void MergeArray(int[] arr, int[] arr2) {
		int[] ma = arr;
		int[] ma2 = arr2;
		int len1 = arr.length;
		int len2 = arr2.length;
		int[] ma3 = new int[len1+len2];
		
//		adding ma array to ma3 (result array)
		for(int i = 0; i<len1; i++) {
			ma3[i] = ma[i];
		}
//		adding ma2 array to ma3 after ma added
		for(int i = 0; i<len2; i++) {
			ma3[len1+i] = ma2[i];
		}
		System.out.println(Arrays.toString(ma3));
		
		//sorting array direct method
		Arrays.sort(ma3);
		System.out.println(Arrays.toString(ma3));
		
		
//		method 2 
		for(int i = 0; i<ma3.length;i++) {
			
			for(int j =0; j<ma3.length;j++) {
				int tmp = 0;
				if (ma3[i] < ma3[j] ){
					tmp = ma3[i];
					ma3[i] = ma3[j];
					ma3[j] = tmp;
				}
				
			}
		}
		System.out.println(Arrays.toString(ma3));
		
		
		}
	

	}


