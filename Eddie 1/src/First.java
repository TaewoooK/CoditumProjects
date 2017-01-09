import java.util.Scanner;
public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		System.out.print("Hi.");
		//System.out.println(" How's your day?");
		System.out.print("Good!");
		System.out.println(" How about you?");
		
		Scanner scan=new Scanner (System.in);
		
		
		
		//int x=5;
		int y=scan.nextInt();
		//System.out.print(x);
		//if (x > 0){System.out.println(" x is positive");}
		
		if (y<0)
		{
		System.out.println("y is negative");	
		}
		else 
		{
			System.out.print("y is not negative");
		}
		
	}

}
