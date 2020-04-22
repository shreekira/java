import java.io.*;
import java.util.Scanner;
public class dcd_bcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i = 0,j;
		int rem[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("�nter the number to be converted into decimal");
		n=sc.nextInt();
		i=0;
		while(n>0)
		{
			
			rem[i]=n%2;
			n=n/2;
			i++;
		}
		System.out.println("The binary number is ");
		for(j=i-1;j>=0;j--)
		{
			int num;
			num=rem[j];
			System.out.println(+num);
		}
		

	}

}
