package problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SentenceQuestion {
	
	public static void main(String[] args) {

//	 String s1 = "Steve eat 45 apple a day. My Brother mario give me 45 apple.My sister Tina is going to eat 10 apple today.";
	 String s1 = "Steve eat 45 apple a day.mario give me 45 apple.Tina is going to eat 10 apple today.";
     
     /// Steve = 45, mario = 45, Tina 10 , total 100  
     String[] s2 = s1.split("\\.");
     int len = s2.length;
     System.out.println(len);
     System.out.print(Arrays.toString(s2));
//     String steve = s2[0];
//     String mario = s2[1];
//     String tina = s2[2];
//     Map<String, Integer> map = new HashMap<String, Integer>();
     String steve =(s2[0]);
     String mario =(s2[1]);
     String tina =(s2[2]);
     
     
     System.out.println(steve);
     System.out.println(mario);
     System.out.println(tina);
     
     String[] st = steve.split("\\s");
     String[] ma = mario.split("\\s");
     String[] ti = tina.split("\\s");
     
     System.out.println(st.length);
     
     String[] sa = new String[22];
     
     	}}
