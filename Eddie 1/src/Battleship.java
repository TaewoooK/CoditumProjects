import java.util.Scanner;
public class Battleship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] playerOneArray= new int[10][10];
		int[][] playerTwoArray=  new int[10][10];
		String[] stringArray= new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };
		int turn=0;
		Scanner input=new Scanner(System.in);
		//input.next()
		
		while (!(checkForWin()==true && !(checkForTie()==true) ) )
		{
			boolean bool = checkForOddOrEven(turn);
			if (bool==true)
			{
				System.out.println("Player one's turn!");
				System.out.println("   1 2 3 4 5 6 7 8 9 10");
				board(playerOneArray, stringArray);
				String y = input.next();
				int x = input.nextInt();
				
				
				playerMissile(y, x, playerOneArray);
				
			}
			else
			{
				System.out.println("Player two's turn!");
				System.out.println("   1 2 3 4 5 6 7 8 9 10");
				board(playerTwoArray, stringArray);
				String y = input.next();
				int x = input.nextInt();
			}
			
			
			turn++;
		}

		
		
	}

	public static void board(int[][] anything, String[] stringArray)
	{
		for (int i=0;i<anything.length;i++)
		{
			System.out.print(stringArray[i]);
			for (int x=0;x<anything[i].length;x++)
			{
				if (!(anything[i][x]==0))
				{
				System.out.print("|" + anything[i][x]);
				}
				else if()
				{
					//fix this
				}
				else if()
				{
					
				}
				else
				{
					
					System.out.print(" " + "|");
				}
			}
			System.out.println(" |");
		}

	}
	
	public static boolean playerMissile(String y, int x, int[][] playerOneArray)
	{
		
		int	yCoordinate = y.charAt(0)-65;  //abc //a
		//hit
		//miss
		//invalid input
		
		
		if (yCoordinate <0 || yCoordinate >= playerOneArray.length || x >= playerOneArray[yCoordinate].length || x < 0 || playerOneArray[yCoordinate][x]==2 || playerOneArray[yCoordinate][x]==1) //invalid input
		{
			return false;
		}
		if (playerOneArray[yCoordinate][x]==0)
		{
			playerOneArray[yCoordinate][x]= 1;
			
			return true;
		}
		else
		{
			playerOneArray[yCoordinate][x]= 2;
			return true;
		}
	}

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
