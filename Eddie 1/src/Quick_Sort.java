
public class Quick_Sort {

	public static void main(String[] args) {

		int []arr = {7, 2, 1, 8, 6, 3, 5, 4};

		System.out.print("Before: ");

		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");

		sort(arr, 0, arr.length-1); 

		System.out.print("After: ");
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
	}

	public static void sort(int []arr, int left, int right)
	{
		if (left < right)
		{
			int pivotIndex = partition (arr, left, right);
			sort(arr, left, pivotIndex);
			sort(arr, pivotIndex+1, right);
		}
	}

	public static int partition(int[] arr, int left, int right)
	{
		int i = left-1;
		int p = arr[right];
		
		for (int j = left; j < right; j++)
		{
			if (arr[j] <= p)
			{
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
	     }
		
		int temp = arr[i+1];
		arr[i+1] = arr[p];
		arr[p] = temp;
		
		
		return (i+1);
		
	}

}
