import java.util.Scanner;
public class Shopping_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("How many items do you want in your shopping list?");
		
		Scanner input=new Scanner(System.in);
		int  number = input.nextInt();
		Scanner inputString = new Scanner (System.in);
		String[] stringarray = new String[number];
		
		System.out.println("Type in the items you want in your shopping list");
		
		for(int i=0;i<stringarray.length;i++)
		{
			stringarray[i]= inputString.nextLine();
		}
		
	System.out.println("Shopping List:");
		
		for(int x=0;x<stringarray.length;x++)
	{
		System.out.println(stringarray[x]);
	}
	
	
	
	
	
	}
	

}
