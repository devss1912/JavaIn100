package problems;

public class Calculator {
	
	public Calculator() {
		System.out.println("from constructor");
		
	}
	static String tst = "Test";
	
	public static void clear()
	{
		System.out.println("clears");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("main class");
		Calculator newcal  = new Calculator();
		System.out.println(tst);
		clear();
	}

}
