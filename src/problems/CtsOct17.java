package problems;
import java.util.*;

public class CtsOct17{
	public static void main(String[] args) {

		int[] intArray2 = {0,0,1,1,1,2,2,3,3,3,4,4};

//		System.out.println(intArray2[0]);

		Arrays.sort(intArray2);
		ArrayList<Integer> new1 = new ArrayList<Integer>();

		new1.add(intArray2[0]);

		for(int i =1; i< intArray2.length; i++){

			if(intArray2[i] == intArray2[i-1]){

			}
			else {
				new1.add(intArray2[i]);



			}

		}
		
		System.out.println(new1);
	}
}