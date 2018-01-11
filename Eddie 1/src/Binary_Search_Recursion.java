import java.util.Scanner;

public class Binary_Search_Recursion {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int []arr= {5,8,10,25,35,38,42,66,82,99};	

		System.out.print("The Array: ");
		for (int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}

		System.out.println("");
		System.out.println("Which number in the array do you want to find the binary number for?");
		int user= input.nextInt();

		System.out.println(binarySearch(arr, user, 0, arr.length-1));
		
	}

	public static int binarySearch(int []arr, int value, int left, int right)
	{
		int mid= (left+right)/2;
		
		if (arr[mid]==value)
		{
			return mid;
		}
		else if(right-left<=0)
		{
			return -1;
		}
		else
		{
			if (value>arr[mid])
			{
				return binarySearch(arr, value, mid+1, right);
			}
			else
			{
				return binarySearch(arr, value, left, mid-1);
			}
		}
		
	}

}
