import java.util.Scanner;

public class Factorials {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);

		System.out.println("Enter the number you want to find the factorial of:");
		int x=input.nextInt();

		System.out.println(recursive(x));

	}

	public static int recursive(int x)
	{
		if (x==1 || x==0)
		{
			return 1;
		}

		if (x<0)
		{
			System.out.println("Cannot find factorial of a negative number!");	
			return x;
		}

		else 
		{
			return recursive(x-1)*x;
		}

	}


}
