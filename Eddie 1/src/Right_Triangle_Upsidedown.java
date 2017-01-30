import java.util.Scanner;

public class Right_Triangle_Upsidedown {

	public static void main(String[] args) {

		/*
		 * "Difference between rt triangle and backward rt triangle."
		 * in the for loop, e=x in backward. e=0 in regular.
		 * e>0 in backward rt triangle, e<x in regular rt triangle
		 * e-- in backward rt triangle, e++ in regular rt triangle
		 *For the next "for loop" i<e in backward rt triangle, i<e+1 in regular rt triangle
		*/
		
		// Tells the user to type in a number and sets variable x as the height of the R

		Scanner user=new Scanner (System.in);
		System.out.println("Please type the measurement of the height of a Right Triangle.");
		int x=user.nextInt();


		//height
		for(int e=x;e>0;e--){

			//variable "e" is the width of the right triangle
			for(int i=0;i<e;i++){
				System.out.print("* ");	
			}
			System.out.println("");		


		}

	}

}
