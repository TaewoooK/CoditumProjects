import java.util.Scanner;
public class Fibonacci_recursive {

	public static void main(String[] args) {

		System.out.println("Which fibonacci number would you like to find?");
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		
		System.out.println(fib(n));	

	}

	public static int fib(int n)
	{
		if (n==1)	
		{
			return 1;
		}
		else if(n==0)
		{
			return 0;
		}
		else 
		{
			return fib(n-1)+ fib(n-2);
		}


	}
}
