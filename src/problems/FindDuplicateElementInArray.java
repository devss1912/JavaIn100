package problems;

import java.util.ArrayList;

public class FindDuplicateElementInArray {
	public static void main(String[] args) {	
		int intArray[] = {1,2,3,4,5,6,7,8,9,1};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		boolean flag = false;
		for(int i =0; i<intArray.length ; i++) {

			for(int j = i+1; j<intArray.length; j++) {

				if(intArray[i] == intArray[j]) {
					flag = true;
					System.out.println("duplicate element found");
				}else if(!al.contains(intArray[i])) {
					al.add(intArray[i]);
				}
			}		
		}
		System.out.print(al);
		if(!flag)
			System.out.println("Duplicate element not found");
	}
	
}
