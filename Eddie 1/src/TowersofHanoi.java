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
		
		
		moveTower(N,"A", "C", "B");
		
		
		

	}

	
	public static void moveTower (int N, String fromPole, String toPole, String withPole)
	{
	if (N>0)
	{
	moveTower(N-1, fromPole, withPole, toPole);
	moveDisk(fromPole, toPole);
	moveTower (N-1, withPole, toPole, fromPole);
	
	
	}
		
			
		
	}
	
	public static void moveDisk(String fromPole, String toPole)
	{
		System.out.println("moved disk from " + fromPole+ " to " + toPole);
		
		
	}
	

}
