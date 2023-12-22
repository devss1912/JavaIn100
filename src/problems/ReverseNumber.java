package problems;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		The java string valueOf() method converts different types of values into string

		//method 1 - using Stringbuffer class
		int x = 123;
		System.out.println("Int to string ->"+ String.valueOf(x));
		StringBuffer s = new StringBuffer(String.valueOf(x));
//		s.append("33");
		s.reverse();
		System.out.println("Integer after reversed->Stringbuffer "+ s);

		//method 2 - using recursion and modulus 

		int num = 1234, rev = 0;

		while(num!=0) 
		{
			rev = rev*10 + num%10; // 0+4=4. 4*10+ 123%10 = 40+3 = 43. 43*10 + 12%10 = 432. 432*10 + 1%10 = 4321
			num = num/10;	//123. 12. 1
		}

		System.out.println("reversed Integer val is using math "+ rev);

		//method 3 - using StringBuilder class
				int x2 = 12345;

				StringBuilder sb = new StringBuilder();
				sb.append(x2);
				sb.reverse();
				System.out.println("Integer after reversed using StringBuilder "+ sb);

	}

}
