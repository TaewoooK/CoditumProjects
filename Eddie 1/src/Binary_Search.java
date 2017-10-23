import java.util.Scanner;
public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("Which number in the array do you want to fine the binary number for?");

		int []binArray=new int [7];

		System.out.print("The Array: ");
		for (int i=0;i <7; i++)
		{
			binArray[i]=i+1;
			System.out.print( binArray[i] + " ");	
		}

		System.out.println("");
		int user=input.nextInt();
		int mid=0;
		int two =2;
		int end;
		int start;
		int sub=0;

		end = binArray.length-1;
		start =0;

		boolean found = false;
		while (!(found))
		{
			sub= end-start;
			mid=sub/two;

			if (binArray[mid]==user)
			{
			System.out.println("Found");	
			break;
			}
			else if (binArray[mid]>user)
			{
				end=mid;
			}
			else
			{
				start=mid;
			}
			System.out.println(mid);
		}

	}
}
