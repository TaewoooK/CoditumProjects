import java.util.Scanner;
public class Calculator_2 {
	static double x;
	static double y;
	static String z;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);
		double x=input.nextDouble();
		String z=input.next();
		double y=input.nextDouble();
		//System.out.prdoubleln("Do you want to add. subtract, multiply or divide?");
		
		if (z.equals("+"))
		{
			add(x, y);
		}
		
		if (z.equals("-"))
		{
			sub(x, y);
		}

		if (z.equals("*"))
		{
			multi(x, y);
		}
	
		if (z.equals("/"))
		{
			divide(x, y);
		}
	}

	public static void add(double x, double y)
	{
		System.out.println(x + y);
	}

	public static void sub(double x, double y)
	{
		System.out.println(x - y);
	}

	public static void multi(double x, double y)
	{
		System.out.println(x*y);
	}

	public static void divide(double x, double y)
	{
		System.out.println(x/y);
	}
}

