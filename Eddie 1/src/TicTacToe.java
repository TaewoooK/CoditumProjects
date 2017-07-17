import java.util.Scanner;
public class TicTacToe 
{

	
	static char[][] chararray= new char[3][3];
	public static void main(String[] args) 
	{

		char character = 'x';
		char circle='o';

		Scanner input= new Scanner(System.in);
		
		//while ()
		System.out.println("At which slot would you like to put x?");
		
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
		
		if ( (chararray[0][0] == char            ) )
		
		
		return false;
	}
	
	

}
