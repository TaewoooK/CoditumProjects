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
			int[][] currentArray;
			String playerTurn;
			if (bool==true)
			{
				playerTurn= "one";
				currentArray=playerOneArray;
			}
			else
			{
				playerTurn= "two";
				currentArray=playerTwoArray;
			}
			
				System.out.println("Player " + playerTurn + "'s turn!");
				System.out.println("   1 2 3 4 5 6 7 8 9 10");
				board(currentArray, stringArray);
				String y = input.next();
				int x = input.nextInt();
				
				piece(currentArray, input );
				playerMissile(y, x, playerOneArray);
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
				if (anything[i][x]==0)
				{
					System.out.print(" " + "|");
				}
				else if(anything[i][x] == 2)
				{
					System.out.print("X" + "|");
				}
				else if(anything[i][x] == 1)
				{
					System.out.print("O" + "|");
				}
				else
				{
					System.out.print(anything[i][x] + "|"  );
					
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
	
	public static void piece(int [][]arrayBoard, Scanner input)
	{
		String y= input.next();
		int x= input.next();
	}

}
