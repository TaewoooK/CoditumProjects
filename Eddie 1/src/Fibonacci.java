import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner user=new Scanner (System.in);
		System.out.println("Type in how many numbers of the Fibonacci sequence you want.");
		int x=user.nextInt();
		
		int first=1;
		int second=1;
		int temp=0;
		
		for(int i=0;i<x;i++)
		{
		
		temp=second;
		second=first+second;
		first=temp;
			
		System.out.println(first);	
			
		}
		


	}

}
