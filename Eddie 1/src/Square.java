import java.util.Scanner;

public class Square {

	public static void main(String[] args) {

		// Tells the user to type in a number and sets variable x as one side of the square
		
		Scanner user=new Scanner (System.in);
		System.out.println("Please type the measurement of one side of the square.");
		int x=user.nextInt();

		//Loops of the loop for square
		
		for(int e=0;e<x;e++){
			// Loops for square
			for(int i=0;i<x;i++){
				System.out.print("* ");	
			}
			
			//System.out.println("");	
			
		}
	}

}
