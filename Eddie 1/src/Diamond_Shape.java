import java.util.Scanner;

public class Diamond_Shape {

	public static void main(String[] args) 
	{
	
		Scanner user=new Scanner (System.in);
		System.out.println("Please type the measurement of the height of a Diamond.");
		int x=user.nextInt();


		//height
		for(int e=x;e>0;e--)
		{

			//variable "e" is the width of the rt, and the space triangle
			for(int i=0;i<e;i++)
			{
				System.out.print("  ");	
			}

			//left side
			for(int i=0;i<x-e+1;i++)
			{
			
				System.out.print("a ");	
				
			}
			
			
			//right side

			for(int i=0;i<x-e;i++)
			{
				System.out.print("b ");	
			}
			
			System.out.println(" ");
		}
		
		
		
		
		//bottom for loop
		
		//height
				for(int e=0;e<x-1;e++){

					//variable "e" is the width of the right triangle
					for(int i=-1;i<e+1;i++){
						System.out.print("  ");	
					}
					for(int i=0;i<x-e-1;i++)
					{
					
						System.out.print("c ");	
					
					}
					for(int i=0;i<x-e-2;i++)
					{
						System.out.print("o ");	
					}
					System.out.println(" ");	
				    }
		
		
		
		
		
		}
			
			
		}
		
		
	
	
	
	


