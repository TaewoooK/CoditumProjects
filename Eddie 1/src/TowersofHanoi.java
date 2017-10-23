import java.util.Scanner;
public class TowersofHanoi {

	public static void main(String[] args) {

		String fromPole;
		String toPole;
		String withPole;
		int N;

		Scanner input=new Scanner (System.in);
		System.out.println("How many disks do you want?");
		N= input.nextInt();

		int[][]intarray=new int[N][3];

		for (int i=0;i<N;i++)
		{
			for (int y=0; y<3; y++)
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


		moveTower(N,0, 2, 1, intarray);
		

	}


	public static void moveTower (int N, int fromPole, int toPole, int withPole, int[][]intarray)
	{
		if (N>0)
		{
			moveTower(N-1, fromPole, withPole, toPole, intarray);
			moveDisk(fromPole, toPole, intarray);
			moveTower (N-1, withPole, toPole, fromPole, intarray);
		}

	}

	public static void moveDisk(int fromPole, int toPole, int[][]intarray)
	{
		System.out.println("moved disk from " + fromPole+ " to " + toPole);	
		int temp=0;
		for (int h=0; h<intarray.length; h++)
		{
			if (intarray[h][fromPole]!=0 && temp==0)
			{
				temp=intarray[h][fromPole];
				intarray[h][fromPole]=0;
			}
		}
		
		for (int g=intarray.length-1; g>=0; g--)
		{
			if (intarray[g][toPole]==0)
			{
				intarray[g][toPole]=temp;
				g=-1;
			}
		}
		
		for (int i=0;i<intarray.length;i++)
		{
			for (int y=0; y<3; y++)
			{

				System.out.print(intarray[i][y] + " ");
			}
			System.out.println();
		}

		
		
		
		
	}
	
	
	
	
	
		
}




