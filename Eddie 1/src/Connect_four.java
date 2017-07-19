import java.util.Scanner;
public class Connect_four {

	static int red=1;
	static int blue=2;
	static int turn=0;
	static int empty = 0;
	static int[][] intarray = new int[6][7];
	static String turnString;
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner input= new Scanner(System.in);
		while (!(checkIfPlayerHasWon() ) && !(checkIfPlayerHasTied() ) )
		{
			checkIfOddOrEven();
			System.out.println(turnString +"'s turn");
			tableLines();
			turn++;

			System.out.println("Where, on the x axis, would you like to place your checker piece? 0 - 6 from left to right");
			int x= input.nextInt();

			playerPiece(x);
			tableLines(); //fix table lines... press play to see the problem


		}








	}

	public static void checkIfOddOrEven()
	{
		if (turn%2==1)
		{
			turnString= "Red";
		}
		else
		{
			turnString="Blue";
		}

	}

	public static boolean checkIfPlayerHasWon()
	{
		//checks horizontally
		for (int y=intarray.length-1;y>=0;y--)
		{
			for (int x=intarray[y].length-1;x>=3;x--)
			{
				if (intarray[y][x] != 0 && intarray[y][x]==intarray[y][x-1] && intarray[y][x-1]==intarray[y][x-2] && intarray[y][x-2]== intarray[y][x-3] )
				{
					System.out.println(turnString + " has WON!");
					return true;
				}
			}
		}
		
		for (int y=intarray.length-1;y>=0;y--)
		{
			for (int x=intarray[y].length-1;x>=3;x--)//do stuff here
			{
				
			}
		}
		return false;

	}

	public static boolean checkIfPlayerHasTied()
	{
		return false;
	}



	public static int playerPiece(int x)
	{
		for (int y=5;y>=0;y--)
		{
			if (intarray[y][x]== empty )
			{
				intarray[y][x]=turn%2+1;
				return y;
			}
		}
		return -1;

	}

	public static void tableLines()
	{
		for (int v=0;v<intarray.length;v++)
		{
			for (int h=0;h<intarray[v].length;h++)
			{
				System.out.print(intarray[v][h] + "|");
			}
			System.out.println(" ");
		}
	}

}
