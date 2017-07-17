
public class remainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkIfOddOrEven(0);
		System.out.println(5%2);
		
		
		
		
	}

	public static boolean checkIfOddOrEven(int number)
	{
	if (number%2==1)
		{
			System.out.println("X's turn");
			return true;
		}
	else
	{
		System.out.println("O's turn");
	return false;
	}
	
	}
	
	
	
}
