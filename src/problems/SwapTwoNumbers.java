package problems;
import java.util.*;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10, b = 5;
		System.out.println("Values before swapping a = " + a + " and b = "+ b);
		//using temp variable method 1 
		int t =0;
		t = a;
		a = b;
		b = t;
		System.out.println("using temp variable method 1 : After swapping a = " + a + " and b = "+ b);
		
		//using addition/subtraction method 2
		a = a+b;   //10+5 = 15
		b = a-b;   //15-5 = 10
		a = a-b;   //15-10 = 5
		System.out.println("using temp variable method 2 : After swapping a = " + a + " and b = "+ b);

	}

}
