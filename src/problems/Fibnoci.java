package problems;

public class Fibnoci {

	public static void main(String[] args) {

		
		//find f(6) fibonic 
		int f=6;
		int a = 0, b = 1, c = 0;
		System.out.print(a + "," + b);
		for (int i = 2; i <= f; i++) {

			c = a + b;
			a = b;
			b = c;
			System.out.print("," + c);
		}

	}
}
