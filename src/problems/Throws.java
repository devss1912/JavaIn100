package problems;

import java.io.*; 
import java.util.*; 


public class Throws {

	// Java program to demonstrate the working 
	// of throws keyword in exception handling 


		public static void writeToFile() throws Exception 
		{ 
			BufferedWriter bw = new BufferedWriter( 
				new FileWriter(".\\mytest.txt")); 
			bw.write("Tes is t"); 
			bw.close(); 
		} 

		public static void main(String[] args) throws Exception 
		{ 
			try { 
				writeToFile(); 
			} 
			catch (Exception e) { 
				e.printStackTrace(); 
			} 
		} 
	}


