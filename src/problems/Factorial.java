package problems;

public class Factorial {
	
	public static void main(String[] args) {
		
		//find n factorial 
		int n= 3, sum=1;
		//first method with decreasing i
		for(int i=n; i>=1; i--) {
			sum= sum*i;
			
		}
		System.out.println(sum);
		
		//second method with increasing i 
		int sum2=1;
		for(int i=1; i<=n; i++) {
			sum2= sum2*i;
			
		}
		System.out.println(sum);
		
	}

}
