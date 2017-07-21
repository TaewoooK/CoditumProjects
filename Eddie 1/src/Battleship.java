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

		for (int i=0;i<5;i++)
		{
			System.out.println("Player one's board setup");
			board(playerOneArray, stringArray);
			System.out.println("Where do you want to place your ship?");
			piece(playerOneArray, input );
		}
		for (int i=0;i<5;i++)
		{
			System.out.println("Player two's board setup");
			board(playerTwoArray, stringArray);
			System.out.println("Where do you want to place your ship?");
			piece(playerTwoArray, input );
		}

		while (!(checkForWin()==true && !(checkForTie()==true) ) )
		{
			boolean bool = checkForOddOrEven(turn);
			int[][] currentArray;
		int[][] enemyBoard;
			String playerTurn;
			if (bool==true)
			{
				playerTurn= "one";
				currentArray=playerOneArray;
				enemyBoard=playerTwoArray;
			}
			else
			{
				playerTurn= "two";
				currentArray=playerTwoArray;
				enemyBoard=playerOneArray;
			}

			System.out.println("Player " + playerTurn + "'s turn!");
			
			board(currentArray, stringArray);
			String y = input.next();
			int x = input.nextInt();

			playerMissile(y, x, enemyBoard);
			turn++;
		}



	}

	public static void board(int[][] anything, String[] stringArray)
	{
		System.out.println("  0 1 2 3 4 5 6 7 8 9");
		for (int i=0;i<anything.length;i++)
		{
			System.out.print(stringArray[i]);
			for (int x=0;x<anything[i].length;x++)
			{
				if (anything[i][x]==0)
				{
					System.out.print("|" + " ");
				}
				else if(anything[i][x] == 2)
				{
					System.out.print("|" + "X");
				}
				else if(anything[i][x] == 1)
				{
					System.out.print("|" + "O");
				}
				else
				{
					System.out.print("|" + anything[i][x] );

				}
			}
			System.out.println("|");
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

	public static void piece(int [][]arrayBoard, Scanner input) //Create invalid stuff
	{
		String y=input.next();
		int x = input.nextInt();
		int yCoordinate=y.charAt(0)-65;  
		System.out.println("In which direction do you want your ship to be placed?");
		String direction=input.next();

		if (direction.equals( "right"))
		{
			arrayBoard[yCoordinate][x]=3;
			arrayBoard[yCoordinate][x+1]=3;
		}
		
		else if (direction.equals("left"))
		{
			arrayBoard[yCoordinate][x]=3;
			arrayBoard[yCoordinate][x-1]=3;
		}
		
		else if (direction.equals("up"))
		{
			arrayBoard[yCoordinate][x]=3;
			arrayBoard[yCoordinate - 1][x]=3;
		}
		
		else if (direction.equals("down"))
		{
			arrayBoard[yCoordinate][x]=3;
			arrayBoard[yCoordinate + 1][x]=3;
		}


	}

}
