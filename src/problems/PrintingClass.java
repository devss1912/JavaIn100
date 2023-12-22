package problems;
import java.util.Scanner;

public class PrintingClass {
		  public static void main(String[] args) {
	            Scanner sc=new Scanner(System.in);
	            System.out.println("================================" + sc);
	            for(int i=0;i<3;i++)
	            {
	                // System.out.println();
	                String s1=sc.next();
	                int x=sc.nextInt();
	                // int len = s1.length() ;
	                
	                String padded = String.format("%-15s", s1);
	                String withIntAppend = String.format("-18s", padded);
	                // if(len <15) {
	                //     s1.append(" ");
	                //     len++;
	                // }
	                System.out.println(withIntAppend);
	                System.out.print(x);
	                //Complete this line
	            }
	            System.out.println("================================");

	    }

}



