import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

	//Tells which function to work based on the user's answer.
		Scanner user=new Scanner (System.in);
		System.out.println("Type 1 for addition, type 2 for subtraction, type 3 for multiplication and type 4 for division.");
		int choose=user.nextInt();
		if (choose==1){
			add(user);
		}
		else if (choose==2){
			subtract(user);
		}
		else if (choose==3){
			multiply(user);
		}
		else if (choose==4){
			division(user);
		}
		else {
			System.out.println("Error.");
		}
	}
	// This function asks the user for 2 numbers and adds them together.
	public static void add(Scanner user){ 
		System.out.println("Please type in two numbers you want to add.");
		int x= user.nextInt();
		int y= user.nextInt();
		System.out.println(x+y);	
	}
	// This function asks the user for 2 numbers and subtracts them.
	public static void subtract(Scanner user){ 
		System.out.println("Please type in two numbers you want to subtract.");
		int x= user.nextInt();
		int y= user.nextInt();
		System.out.println(x-y);
	}
	
	// This function asks the user for 2 numbers and multiplies them.
	public static void multiply(Scanner user){ 
		System.out.println("Please type in two numbers you want to multiply.");
		int x= user.nextInt();
		int y= user.nextInt();			
		System.out.println(x*y);
	}
		
	// This function asks the user for 2 numbers and divides them.
	public static void division(Scanner user){ 
		System.out.println("Please type in two numbers you want to divide.");
		float x= user.nextFloat();
		float y= user.nextFloat();
		System.out.println(x/y);
	}
	
	
	
}

