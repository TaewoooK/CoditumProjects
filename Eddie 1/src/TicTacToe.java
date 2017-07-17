import java.util.Scanner;
public class TicTacToe 
{


	static char[][] chararray= new char[3][3];
	static int turnNum=0;
	static char turn='x';

	public static void main(String[] args) 
	{
		for(int i=0;i<chararray.length;i<++)
		{
			
		}
		
		
		char character = 'x';
		char circle='o';

		Scanner input= new Scanner(System.in);
		while ( !(checkForWin()) && !(checkForTie()) )
		{
			checkIfOddOrEven(turnNum);
			ticTacToeLines();
			
			
			turnNum++;
		}
		System.out.println("At which slot would you like to put o?");

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
		if (turn==9)
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
			System.out.println("X's turn");
			turn='x';
		}
		else
		{
			System.out.println("O's turn");
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




}
