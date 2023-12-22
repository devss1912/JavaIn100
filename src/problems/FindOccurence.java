package problems;

import java.util.*;

public class FindOccurence {

	public static void main(String args[]) {
	
		String str2 = "Devaraj";
	
//	public void findOccur() {
HashMap<Character, Integer> hm = new HashMap<Character, Integer>() ;
for(int i=0; i<str2.length()-1; i++) 
	hm.put(str2.charAt(i) , hm.getOrDefault(str2.charAt(i),0)+1);

for (char k : hm.keySet()) 
	if(hm.get(k)>1) System.out.print(k);


String myStr = "Devaraj";

char[] myChar = myStr.toCharArray();

for(int j=0; j<myChar.length-1; j++){
	char c2comp = myChar[j];	
	for(int k =0; k<myChar.length-2; k++) {
		
	}
	if (c2comp == myChar[j+1]) {
		System.out.println("found match");
		break;
//		System.out.println(mychar[j]);
	}
	
}


//System.out.println(myChar[0]);

}
	
	
}