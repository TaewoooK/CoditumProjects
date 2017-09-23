import java.util.Scanner;
public class Towers {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);

		System.out.println("How many rings do you want?");
		int x= input.nextInt();
		int[][]intarray=new int[x][3];

		for (int i=0;i<x;i++)
		{
			for (int y=0;y<3;y++)
			{
				intarray[i][y]=0;

				if (y==0)
				{
					intarray[i][y]=i+1;
				}


				System.out.print(intarray[i][y] + " ");
			}
			System.out.println();
		}


	}

	public static void tower(int [][] towerarray)
	{
		
	}

}
