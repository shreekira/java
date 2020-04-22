package pg1;
import java.io.*; 
import java.util.Scanner;
public class ci {
	  public static void main(String args[]) 
	    { 
	        double principle, rate, time;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the priniciple amount");
	        principle=sc.nextDouble();
	        System.out.println("Enter the rate");
	        rate=sc.nextDouble();
	        System.out.println("Enter the time");
	        time=sc.nextDouble();
	        double CI = principle * 
	                    (Math.pow((1 + rate / 100), time));    
	        System.out.println("Compound Interest is "+ CI); 
	    } 

}	
