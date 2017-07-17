import java.util.Scanner;

public class Summertech_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//boolean x = (5== 7); 
		//x=true;
		
	/*	if (x )
		{
			System.out.println ("x is true");
		}
		else
		{
			System.out.println (" x is false");
		}
		
		for(int i=0;i<10;i++)
		{
			System.out.println(i + " Hello");
		}	
		
		int y=0;
		while (y<10)
		{
			System.out.println(y + " Bye");
			y++;
		}
		
		for (float z=0;z<1;z=z+.1f)
		{
			System.out.println(z);
		}
	*/
	
	/*for(int y=1;y<6;y++)
	{
		for (int x=1;x<6;x++)
		{
			System.out.print ("x");
		}
		System.out.print("\n");
	
	}
	*/
	
		for (int x=1;x<6;x++)
		{
			
			for (int y=0;y<x;y++)
			{
				System.out.print("x ");
			}
			System.out.println();
		}
		
		int[] intarray;
		intarray = new int[6];
		intarray [0]=0;
		intarray [1]=1;
		intarray [2]=2;
		intarray [3]=3;
		//intarray []
		intarray[5]=6;
		
		intarray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int counter=0;counter<intarray.length;counter++)
		{
		System.out.println(intarray[counter]);
		}
		
		Scanner input=new Scanner(System.in);
		String word = input.nextLine();
		System.out.println(word);

	}
	

}
