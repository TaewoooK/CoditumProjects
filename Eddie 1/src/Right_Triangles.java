import java.util.Scanner;

public class Right_Triangles {

	public static void main(String[] args) {

		// Tells the user to type in a number and sets variable x as the height of the R

		Scanner user=new Scanner (System.in);
		System.out.println("Please type the measurement of the height of a Right Triangle.");
		int x=user.nextInt();


		//height
		for(int e=0;e<x;e++){

			//variable "e" is the width of the right triangle
			for(int i=-1;i<e+1;i++){
				System.out.print("* ");	
			}
			System.out.println(" ");	


		}
	}
}
