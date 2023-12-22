package problems;

public class FindEvenOddNumbersInArray {
	public static void main(String[] args) {	
		int intArray[] = {1,2,3,4,5,6,7,8,9,1};
//		boolean flag = false;
		int evenCnt =0, oddCnt = 0;
		for(int i =0; i<intArray.length ; i++) {
			
			if( intArray[i]%2  == 0 ) {
				evenCnt++;
			}
			else {
				oddCnt++;
			}
		}
		System.out.println("Even Number Count is "+ evenCnt+ " Odd Number Count is "+ oddCnt);
		
	}
}
