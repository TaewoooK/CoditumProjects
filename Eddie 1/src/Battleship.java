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


		boolean valid=false;

		//Player One
		while(valid==false)
		{
			System.out.println("Player one's board setup");
			board(playerOneArray, stringArray);
			System.out.println("Where do you want to place your Patrol Boat (2 spaces)");
			valid=twoPiece(playerOneArray, input );
		}

		valid=false;
		while(valid==false)
		{
			System.out.println("Player one's board setup");
			board(playerOneArray, stringArray);
			System.out.println("Where do you want to place your Destroyer (3 spaces) ");
			valid=threePiece(playerOneArray, input);
		}

		valid=false;
		while(valid==false)
		{
			System.out.println("Player one's board setup");
			board(playerOneArray, stringArray);
			System.out.println("Where do you want to place your Submarine (3 spaces) ");
			valid=threePiece(playerOneArray, input);	
		}
		valid=false;
		while(valid==false)
		{
			System.out.println("Player one's board setup");
			board(playerOneArray, stringArray);
			System.out.println("Where do you want to place your Battleship (4 spaces) ");
			valid=fourPiece(playerOneArray, input); 
		}
		
		
		
		//Player Two
		valid=false;
		while(valid==false)
		{
			System.out.println("Player two's board setup");
			board(playerTwoArray, stringArray);
			System.out.println("Where do you want to place your Patrol Boat (2 spaces) ");
			valid=twoPiece(playerTwoArray, input );
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

	public static boolean twoPiece(int [][]arrayBoard, Scanner input) 
	{

		String y=input.next();
		int x = input.nextInt();
		int yCoordinate=y.toUpperCase().charAt(0)-65;  
		if (yCoordinate>9 || yCoordinate<0)
		{
			System.out.println("Invalid");
			return false;
		}

		if (x<0 || x>9)
		{
			System.out.println("Invalid");
			return false;
		}

		System.out.println("In which direction do you want your ship to be placed?");
		String direction=input.next();

		if (direction.equalsIgnoreCase( "right"))
		{
			if(x==9)
			{
				System.out.println("Invalid");
				return false;
			}
			else
			{
				arrayBoard[yCoordinate][x]=3;
				arrayBoard[yCoordinate][x+1]=3;
				return true;
			}
		}

		else if (direction.equalsIgnoreCase("left"))
		{
			if(x==0)
			{
				System.out.println("Invalid");
				return false;
			}
			arrayBoard[yCoordinate][x]=3;
			arrayBoard[yCoordinate][x-1]=3;
			return true;
		}

		else if (direction.equalsIgnoreCase("up"))
		{
			if(y=="A" || y=="a")
			{
				System.out.println("Invalid");
				return false;
			}
			arrayBoard[yCoordinate][x]=3;
			arrayBoard[yCoordinate - 1][x]=3;
			return true;
		}

		else if (direction.equalsIgnoreCase("down"))
		{
			if(y=="J" || y=="j")
			{
				System.out.println("Invalid");
				return false;
			}
			arrayBoard[yCoordinate][x]=3;
			arrayBoard[yCoordinate + 1][x]=3;
			return true;

		}

		else
		{
			System.out.println("Invalid");
			return false;
		}
	}

	public static boolean threePiece(int [][]arrayBoard, Scanner input) 
	{

		String y=input.next();
		int x = input.nextInt();
		int yCoordinate=y.toUpperCase().charAt(0)-65;  
		if (yCoordinate>9 || yCoordinate<0)
		{
			System.out.println("Invalid");
			return false;
		}

		if (x<0 || x>9)
		{
			System.out.println("Invalid");
			return false;
		}

		System.out.println("In which direction do you want your ship to be placed?");
		String direction=input.next();

		if (direction.equalsIgnoreCase( "right"))
		{
			if(x>7)
			{
				System.out.println("Invalid");
				return false;
			}
			else
			{
				arrayBoard[yCoordinate][x]=3;
				arrayBoard[yCoordinate][x+1]=3;
				arrayBoard[yCoordinate][x+2]=3;
				return true;
			}
		}

		else if (direction.equalsIgnoreCase("left"))
		{
			if(x<2)
			{
				System.out.println("Invalid");
				return false;
			}
			arrayBoard[yCoordinate][x]=3;
			arrayBoard[yCoordinate][x-1]=3;
			arrayBoard[yCoordinate][x+2]=3;
			return true;
		}

		else if (direction.equalsIgnoreCase("up"))
		{
			if(y=="A" || y=="a" || y=="B" || y=="b")
			{
				System.out.println("Invalid");
				return false;
			}
			arrayBoard[yCoordinate][x]=3;
			arrayBoard[yCoordinate - 1][x]=3;
			arrayBoard[yCoordinate - 2][x]=3;
			return true;
		}

		else if (direction.equalsIgnoreCase("down"))
		{
			if(y=="J" || y=="j" || y=="I" || y=="i")
			{
				System.out.println("Invalid");
				return false;
			}
			arrayBoard[yCoordinate][x]=3;
			arrayBoard[yCoordinate + 1][x]=3;
			arrayBoard[yCoordinate + 2][x]=3;
			return true;

		}

		else
		{
			System.out.println("Invalid");
			return false;
		}
	}
	public static boolean fourPiece(int [][]arrayBoard, Scanner input) //create invalid stuff
	{

		String y=input.next();
		int x = input.nextInt();
		int yCoordinate=y.toUpperCase().charAt(0)-65;  
		if (yCoordinate>9 || yCoordinate<0)
		{
			System.out.println("Invalid");
			return false;
		}

		if (x<0 || x>9)
		{
			System.out.println("Invalid");
			return false;
		}

		System.out.println("In which direction do you want your ship to be placed?");
		String direction=input.next();

		if (direction.equalsIgnoreCase( "right"))
		{
			if(x>7)
			{
				System.out.println("Invalid");
				return false;
			}
			else
			{
				arrayBoard[yCoordinate][x]=3;
				arrayBoard[yCoordinate][x+1]=3;
				arrayBoard[yCoordinate][x+2]=3;
				return true;
			}
		}

		else if (direction.equalsIgnoreCase("left"))
		{
			if(x<2)
			{
				System.out.println("Invalid");
				return false;
			}
			arrayBoard[yCoordinate][x]=3;
			arrayBoard[yCoordinate][x-1]=3;
			arrayBoard[yCoordinate][x+2]=3;
			return true;
		}

		else if (direction.equalsIgnoreCase("up"))
		{
			if(y=="A" || y=="a" || y=="B" || y=="b")
			{
				System.out.println("Invalid");
				return false;
			}
			arrayBoard[yCoordinate][x]=3;
			arrayBoard[yCoordinate - 1][x]=3;
			arrayBoard[yCoordinate - 2][x]=3;
			return true;
		}

		else if (direction.equalsIgnoreCase("down"))
		{
			if(y=="J" || y=="j" || y=="I" || y=="i")
			{
				System.out.println("Invalid");
				return false;
			}
			arrayBoard[yCoordinate][x]=3;
			arrayBoard[yCoordinate + 1][x]=3;
			arrayBoard[yCoordinate + 2][x]=3;
			return true;

		}

		else
		{
			System.out.println("Invalid");
			return false;
		}
	}


}
