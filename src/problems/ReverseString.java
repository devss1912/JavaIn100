package problems;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "RACEcar";

		//using charAt method
		String rev = "";

		for(int i=s1.length()-1; i>=0 ; i--){
			char c1 ;
			c1 = s1.charAt(i);
			rev =  rev + c1;
			System.out.println(rev);
		}
//		for(int i=0; i<s1.length() ; i++){
//			char c2 ;
//			c2 = s1.charAt(i);
//			rev =  rev + c2;
//			System.out.println(rev);
//		}

//		System.out.println(rev);
	}

}
