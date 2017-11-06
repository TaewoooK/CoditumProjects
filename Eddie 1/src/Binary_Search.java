import java.util.Scanner;
public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("Which number in the array do you want to fine the binary number for?");

		int []binArray={1, 5, 6, 8, 10,};
		System.out.print("The Array: ");

		for (int i=0;i<binArray.length;i++)
		{
			System.out.print( binArray[i] + " ");	
		}

		System.out.println("");
		int user=input.nextInt();
		
		int mid=0;
		int two =2;
		int end;
		int start;
		int sub=0;

		end = binArray.length;
		start =0;

		sub= end-start;
		mid=sub/two;

		boolean found = false;
		while (!(found))
		{
//			System.out.println(start);
//			System.out.println(end);
			if (end-start == 1)
			{
			System.out.println("The number is not in the array");
			break;
			}
			

			if (binArray[mid]==user)
			{	
				System.out.println("The target of the number is "+ mid);	

				break;
			}
			else if (user>binArray[mid])
			{
				start=mid;
				sub= end-start;
				mid=(sub/two)+start;
			}

			else if(user<binArray[mid])
			{
				end=mid;
				sub= end-start;
				mid=sub/two;
			}
			else{
				break;
			}

		}

	}

}
