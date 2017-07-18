import java.util.Scanner;
public class TicTacToe 
{


	static char[][] chararray= new char[3][3];
	static int turnNum=0;
	static char turn='x';

	public static void main(String[] args) 
	{
		for(int i=0;i<chararray.length;i++)
		{
			for (int f=0;f<chararray.length;f++)
			{
				chararray[i][f]= Integer.toString(i*chararray[i].length+f).charAt(0);
			}
		}


		char character = 'x';
		char circle='o';

		Scanner input= new Scanner(System.in);
		while ( !(checkForWin()) && !(checkForTie()) )
		{
			checkIfOddOrEven(turnNum);
			System.out.println(turn + "'s turn");


			boolean valid = false;

			int y = 0;
			int x = 0;
			while(valid==false)
			{	
				ticTacToeLines();
				System.out.println("At which slot would you like to put " + turn + "?");
				
				
				boolean validInput=false;
				while(validInput==false)
				{
					if (input.hasNextInt())
					{
						validInput=true;
						y = input.nextInt();
					}
					else
					{
						input.next();
					}
				} //input mismatch
				
				validInput=false;
				while (validInput==false)
				{
					if (input.hasNextInt())
					{
						validInput=true;
						x=input.nextInt();
					
					}
					else
					{
						input.next();
					}
				}
				valid = checkForValidMove(y,x);
			}

			chararray[y][x]=turn;
			turnNum++;
		}


		//i*intarray[i].length+j


	}

	public static boolean checkForWin()
	{
		for (int i=0;i<3;i++)
		{
			if ((chararray[i][0] == chararray[i][1]) && (chararray[i][1]== chararray[i][2]))
			{
				System.out.println("YOU WIN!");
				return true;
				//never reached
			}
		}

		for (int x=0;x<3;x++)
		{
			if ( (chararray[0][x] == chararray[1][x]) && (chararray[1][x] == chararray[2][x]) )
			{
				System.out.println("YOU WIN!");
				return true;
			}
		}

		if ( (chararray[0][0] == chararray[1][1]) && (chararray [1][1] == chararray[2][2]) )
		{
			System.out.println("YOU WIN!");
			return true;
		}
		if ( (chararray[0][2] == chararray[1][1]) && ( chararray [1][1] == chararray [2][0]) )
		{
			System.out.println("YOU WIN!");
			return true;
		}

		return false;
	}

	public static boolean checkForTie()
	{
		if (turnNum==9)
		{
			System.out.println("IT'S A TIE!");
			return true;
		}
		return false;
		//return turn==9;
	}

	public static void checkIfOddOrEven(int number)
	{
		if (number%2==1)
		{
			turn='x';
		}
		else
		{
			turn='o';
		}
	}

	public static void ticTacToeLines()
	{
		System.out.println(chararray[0][0] + "|" + chararray[0][1] + "|" + chararray[0][2] );
		System.out.println("-----" );
		System.out.println(chararray[1][0] + "|" + chararray[1][1] + "|" + chararray[1][2] );
		System.out.println("-----" );
		System.out.println(chararray[2][0] + "|" + chararray[2][1] + "|" + chararray[2][2] );



	}

	public static boolean checkForValidMove(int y, int x)
	{
		if (0<=y && y<=2 && x>=0 && x<=2)
		{

		}
		else 
		{
			System.out.println("Invalid Move!");
			return false;
		}
		if (chararray[y][x]=='x' || chararray[y][x]=='o')
		{
			System.out.println("Invalid Move!");
			return false;
		}
		return true;
	}



}
