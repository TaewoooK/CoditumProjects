import java.util.Scanner;

public class Hollow_Diamond {

	public static void main(String[] args) {

		Scanner user=new Scanner (System.in);
		System.out.println("Please type the measurement of half the height of a Diamond.");
		int x=user.nextInt();


		//height
		for(int e=x;e>0;e--)
		{

			//variable "e" is the height of the rt, and the space triangle
			for(int i=0;i<e;i++)
			{
				System.out.print("  ");	
			}

			//left side
			for(int i=0;i<x-e+1;i++)
			{
				if(i==0)
				{

					System.out.print("a ");	
				}
				else
				{
					System.out.print("  ");
				}
			}


			//right side

			for(int i=0;i<x-e;i++)
			{
				if (i==x-e-1)
				{
					System.out.print("b ");
				}
				else
				{
					System.out.print("  ");
				}

			}



			System.out.println(" ");
		}




		//bottom for loop

		//height
		for(int e=0;e<x-1;e++){

			//variable "e" is the height of the right triangle
			for(int i=-1;i<e+1;i++){
				System.out.print("  ");	
			}
			
			//left bottom side. {x (number given by user) - e (height) - 1}
			for(int i=0;i<x-e-1;i++)
			{
				if (i==0)
				{
					System.out.print("c ");	
				}
				else
				{	
					System.out.print("  ");	
				}
			}
			
			//right bottom side
			for(int i=0;i<x-e-2;i++)
			{
				if (i==x-e-3)
				{
					System.out.print("o ");	
				}
				else
				{
					System.out.print("  ");	
				}
			}
			System.out.println(" ");	
		}


	}

}
