import java.util.Scanner;
public class Battleship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] playerOneArray= new int[10][10];
		int[][] playerTwoArray=  new int[10][10];
		int turn=0;
		Scanner input=new Scanner(System.in);
		//input.next()
		
		while (!(checkForWin()==true && !(checkForTie()==true) ) )
		{
			boolean bool = checkForOddOrEven(turn);
			if (bool==true)
			{
				System.out.println("Player one's turn!");
				board(playerOneArray);
				input.next();
			}
			else
			{
				System.out.println("Player two's turn!");
				board(playerTwoArray);
				input.next();
			}
			turn++;
		}

		
		
	}

	public static void board(int[][] anything)
	{
		for (int i=0;i<anything.length;i++)
		{
			for (int x=0;x<anything[i].length;x++)
			{
				if (!(anything[i][x]==0))
				{
				System.out.print("|" + anything[i][x]);
				}
				else
				{
					System.out.print("|" + " ");
				}
			}
			System.out.println("|");
		}

	}
// figure out how to put letter on y axis and numbers on x axis
	

	public static boolean checkForOddOrEven(int turn)
	{
		if (turn%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}

	}
	
	public static boolean checkForWin()
	{
		return false;
	}

	public static boolean checkForTie()
	{
		return false;
	}

}
