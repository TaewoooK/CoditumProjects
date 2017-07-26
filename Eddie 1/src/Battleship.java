

import java.util.Scanner;
public class Battleship {

	public static void main(String[] args) {

		int[][] playerOneArray= new int[10][10];
		int[][] playerTwoArray=  new int[10][10];
		String[] stringArray= new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };
		int turn=0;

		Scanner input=new Scanner(System.in);
		//input.next()


		boolean valid=false;

		//Player One
		for(int i=0; i<2;i++)
		{
			int[][]currentBoard;
			String turnNum;
			if (i==0)
			{
				turnNum="one";
				currentBoard = playerOneArray;
			}
			else
			{
				turnNum="two";
				currentBoard = playerTwoArray;
			}

			valid=false;
			while(valid==false)
			{
				System.out.println("Player "+ turnNum +"'s board setup");
				board(currentBoard, stringArray);
				System.out.println("Where do you want to place your Patrol Boat? (2 spaces)");
				valid=twoPiece(currentBoard, input );
			}

			valid=false;
			while(valid==false)
			{
				System.out.println("Player "+ turnNum +"'s board setup");
				board(currentBoard, stringArray);
				System.out.println("Where do you want to place your Destroyer? (3 spaces) ");
				valid=threePiece(currentBoard, input);
			}

			valid=false;
			while(valid==false)
			{
				System.out.println("Player "+ turnNum +"'s board setup");
				board(currentBoard, stringArray);
				System.out.println("Where do you want to place your Submarine? (3 spaces) ");
				valid=threePiece(currentBoard, input);	
			}
			valid=false;
			while(valid==false)
			{
				System.out.println("Player "+ turnNum +"'s board setup");
				board(currentBoard, stringArray);
				System.out.println("Where do you want to place your Battleship? (4 spaces) ");
				valid=fourPiece(currentBoard, input); 
			}
			valid=false;
			while(valid==false)
			{
				System.out.println("Player "+ turnNum +"'s board setup");
				board(currentBoard, stringArray);
				System.out.println("Where do you want to place your Aircraft Carrier? (5 spaces) ");
				valid=fivePiece(currentBoard, input); 
			}
		}

		while (!(checkForWin(playerOneArray, playerTwoArray)==true ) )
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
			System.out.println("Where do you want to fire?");
			String y = input.next();
			int x = input.nextInt();

			boolean pm = playerMissile(y, x, enemyBoard);
			if (pm==false)
			{
				System.out.println("Invalid");
				System.out.println("Player " + playerTurn + "'s turn!");

				board(currentArray, stringArray);
				System.out.println("Where do you want to fire?");
				y = input.next();
				x = input.nextInt();
				pm=playerMissile(y, x, enemyBoard);

			}
			if (pm==true)
			{
				turn++;
			}
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
				if (anything[i][x] == 0)
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

				else if(anything[i][x] == 3)
				{
					System.out.print("|" + "+");
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

		int	yCoordinate = y.toUpperCase().charAt(0)-65;  //abc //a
		//hit
		//miss
		//invalid input

		if (yCoordinate <0 || yCoordinate >= playerOneArray.length || x >= playerOneArray[yCoordinate].length || x < 0 || playerOneArray[yCoordinate][x]==2 || playerOneArray[yCoordinate][x]==1) //invalid input
		{
			//System.out.println(yCoordinate+" "+x);
			return false;
		}

		if (playerOneArray[yCoordinate][x]==3)
		{
			playerOneArray[yCoordinate][x]= 2;
			System.out.println("HIT!");
			return true;
		}
		else
		{
			playerOneArray[yCoordinate][x]= 1;
			System.out.println("MISS!");
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

	public static boolean checkForWin(int [][]playerOneArray, int[][] playerTwoArray)
	{
		for(int i=0; i<2;i++)
		{
			int[][]currentBoard;
			if (i==0)
			{
				currentBoard = playerOneArray;
			}
			else
			{
				currentBoard = playerTwoArray;
			}

			boolean is3=false;
			for (int y=0; y<10; y++)
			{
				for (int x=0;x<10;x++)
				{
					if (currentBoard[y][x]==3) 
					{

						is3=true;
					}
				}

			}
			if (!is3)
			{
				System.out.println("YOU WIN!");
				return true;
			}

		}
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
			if(x==9 || arrayBoard[yCoordinate][x]==3 || arrayBoard[yCoordinate][x+1]==3)
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
			if(x==0 || arrayBoard[yCoordinate][x]==3 || arrayBoard[yCoordinate][x-1]==3 )
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
			if(y.equalsIgnoreCase( "A")|| arrayBoard[yCoordinate][x]==3 || arrayBoard[yCoordinate-1][x]==3)
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
			if(y.equalsIgnoreCase( "j")|| arrayBoard[yCoordinate][x]==3 || arrayBoard[yCoordinate+1][x]==3)
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
			if(x>7|| arrayBoard[yCoordinate][x]==3 || arrayBoard[yCoordinate][x+1]==3 || arrayBoard[yCoordinate][x+2]==3 )
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
			if(x<2|| arrayBoard[yCoordinate][x]==3 || arrayBoard[yCoordinate][x-1]==3 || arrayBoard[yCoordinate][x-2]==3)
			{
				System.out.println("Invalid");
				return false;
			}
			arrayBoard[yCoordinate][x]=3;
			arrayBoard[yCoordinate][x-1]=3;
			arrayBoard[yCoordinate][x-2]=3;
			return true;
		}

		else if (direction.equalsIgnoreCase("up"))
		{
			if(y.equalsIgnoreCase( "A") ||y.equalsIgnoreCase( "b")|| arrayBoard[yCoordinate][x]==3 || arrayBoard[yCoordinate-1][x]==3 || arrayBoard[yCoordinate-2][x]==3)
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
			if(y.equalsIgnoreCase( "j") ||y.equalsIgnoreCase( "i")|| arrayBoard[yCoordinate][x]==3 || arrayBoard[yCoordinate+1][x]==3 || arrayBoard[yCoordinate+2][x]==3)
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
	public static boolean fourPiece(int [][]arrayBoard, Scanner input)
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
			if(x>6 || arrayBoard[yCoordinate][x]==3 || arrayBoard[yCoordinate][x+1]==3 || arrayBoard[yCoordinate][x+2]==3 || arrayBoard[yCoordinate][x+3]==3)
			{
				System.out.println("Invalid");
				return false;
			}
			else
			{
				arrayBoard[yCoordinate][x]=3;
				arrayBoard[yCoordinate][x+1]=3;
				arrayBoard[yCoordinate][x+2]=3;
				arrayBoard[yCoordinate][x+3]=3;
				return true;
			}
		}

		else if (direction.equalsIgnoreCase("left"))
		{
			if(x<3 || arrayBoard[yCoordinate][x]==3 || arrayBoard[yCoordinate][x-1]==3 || arrayBoard[yCoordinate][x-2]==3 || arrayBoard[yCoordinate][x-3]==3)
			{
				System.out.println("Invalid");
				return false;
			}
			arrayBoard[yCoordinate][x]=3;
			arrayBoard[yCoordinate][x-1]=3;
			arrayBoard[yCoordinate][x-2]=3;
			arrayBoard[yCoordinate][x-3]=3;
			return true;
		}

		else if (direction.equalsIgnoreCase("up"))
		{
			if(y.equalsIgnoreCase( "A")|| y.equalsIgnoreCase( "b") || y.equalsIgnoreCase( "c")  || arrayBoard[yCoordinate][x]==3 || arrayBoard[yCoordinate-1][x]==3 || arrayBoard[yCoordinate-2][x]==3 || arrayBoard[yCoordinate-3][x]==3)
			{
				System.out.println("Invalid");
				return false;
			}
			arrayBoard[yCoordinate][x]=3;
			arrayBoard[yCoordinate - 1][x]=3;
			arrayBoard[yCoordinate - 2][x]=3;
			arrayBoard[yCoordinate - 3][x]=3;
			return true;
		}

		else if (direction.equalsIgnoreCase("down"))
		{
			if(y.equalsIgnoreCase( "j") ||y.equalsIgnoreCase( "i")||y.equalsIgnoreCase( "h")  || arrayBoard[yCoordinate][x]==3 || arrayBoard[yCoordinate+1][x]==3 || arrayBoard[yCoordinate+2][x]==3 || arrayBoard[yCoordinate+3][x]==3)
			{
				System.out.println("Invalid");
				return false;
			}
			arrayBoard[yCoordinate][x]=3;
			arrayBoard[yCoordinate + 1][x]=3;
			arrayBoard[yCoordinate + 2][x]=3;
			arrayBoard[yCoordinate + 3][x]=3;
			return true;

		}

		else
		{
			System.out.println("Invalid");
			return false;
		}
	}


	public static boolean fivePiece(int [][]arrayBoard, Scanner input) 
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
			if(x>5 ||  arrayBoard[yCoordinate][x]==3 || arrayBoard[yCoordinate][x+1]==3 || arrayBoard[yCoordinate][x+2]==3 || arrayBoard[yCoordinate][x+3]==3 || arrayBoard[yCoordinate][x+4]==3)
			{
				System.out.println("Invalid");
				return false;
			}
			else
			{
				arrayBoard[yCoordinate][x]=3;
				arrayBoard[yCoordinate][x+1]=3;
				arrayBoard[yCoordinate][x+2]=3;
				arrayBoard[yCoordinate][x+3]=3;
				arrayBoard[yCoordinate][x+4]=3;
				return true;
			}
		}

		else if (direction.equalsIgnoreCase("left"))
		{
			if(x<4||  arrayBoard[yCoordinate][x]==3 || arrayBoard[yCoordinate][x-1]==3 || arrayBoard[yCoordinate][x-2]==3 || arrayBoard[yCoordinate][x-3]==3 || arrayBoard[yCoordinate][x-4]==3)
			{
				System.out.println("Invalid");
				return false;
			}

			arrayBoard[yCoordinate][x]=3;
			arrayBoard[yCoordinate][x-1]=3;
			arrayBoard[yCoordinate][x-2]=3;
			arrayBoard[yCoordinate][x-3]=3;
			arrayBoard[yCoordinate][x-4]=3;
			return true;
		}

		else if (direction.equalsIgnoreCase("up"))
		{
			if(y.equalsIgnoreCase( "A") || y.equalsIgnoreCase( "b") ||y.equalsIgnoreCase( "c") || y.equalsIgnoreCase( "d")||  arrayBoard[yCoordinate][x]==3 || arrayBoard[yCoordinate-1][x]==3 || arrayBoard[yCoordinate-2][x]==3 || arrayBoard[yCoordinate-3][x]==3 || arrayBoard[yCoordinate-4][x]==3)
			{
				System.out.println("Invalid");
				return false;
			}
			arrayBoard[yCoordinate][x]=3;
			arrayBoard[yCoordinate - 1][x]=3;
			arrayBoard[yCoordinate - 2][x]=3;
			arrayBoard[yCoordinate - 3][x]=3;
			arrayBoard[yCoordinate - 4][x]=3;
			return true;
		}

		else if (direction.equalsIgnoreCase("down"))
		{
			if(y.equalsIgnoreCase( "j")|| y.equalsIgnoreCase( "i")|| y.equalsIgnoreCase( "h") || y.equalsIgnoreCase( "g")||  arrayBoard[yCoordinate][x]==3 || arrayBoard[yCoordinate+1][x]==3 || arrayBoard[yCoordinate+2][x]==3 || arrayBoard[yCoordinate+3][x]==3 || arrayBoard[yCoordinate+4][x]==3)
			{
				System.out.println("Invalid");
				return false;
			}
			arrayBoard[yCoordinate][x]=3;
			arrayBoard[yCoordinate + 1][x]=3;
			arrayBoard[yCoordinate + 2][x]=3;
			arrayBoard[yCoordinate + 3][x]=3;
			arrayBoard[yCoordinate + 4][x]=3;
			return true;

		}

		else
		{
			System.out.println("Invalid");
			return false;
		}
	}
	public static void checkIfShipHasSunk(String y, int x, int[][]currentArray )
	{
	


	}
}
