package problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {
	
	  public static void main (String[]args)
	  {
//	    System.out.println ("Hello World");
//	    
//	    int[] ar1 = {3,3,4,5,6,7,9};
//	    System.out.println(Arrays.toString(ar1));
//	    
	    
	    
		  String s1 = "Daily dall";
		  s1 =s1.toLowerCase();
		  s1= s1.replaceAll("\\s", "");
		  System.out.println(s1);
		  
		  Map<Character, Integer> map = new HashMap<Character, Integer>();
		  
		  for(int i=0; i<s1.length()-1; i++) {
			  
			  map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i),0)+1);
		  }
			  
		  
	    for(char c: map.keySet()) {
	    	System.out.print(c);
	    	System.out.print(map.get(c));
	    	
	    	
	    }
	    
	  }
}


