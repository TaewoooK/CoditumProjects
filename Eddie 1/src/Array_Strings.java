import java.util.Scanner;

public class Array_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String[] stringarray=new String[5];
	Scanner input=new Scanner(System.in);
	
	for(int counter=0; counter<stringarray.length; counter++)
	{
		stringarray[counter]=input.nextLine();
	}
	
	for(int i=0;i<stringarray.length; i++)
	{
		System.out.println(stringarray[i]);
	}
	
	
	
	}
	

}
