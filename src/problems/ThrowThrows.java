package problems;

public class ThrowThrows {
	// Java program to demonstrate the working
	// of throw keyword in exception handling

	public static void main(String[] args) {
		// Use of unchecked Exception
		try {
			double x = 3 / 0;
			System.out.println(x);
//			throw new ArithmeticException();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}
}