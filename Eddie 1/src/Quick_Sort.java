
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
			int pivotIndex = partition (arr, 0, arr.length-1);
			sort(arr, left, pivotIndex);
			sort(arr, pivotIndex, right);
		}
	}

	public static int partition(int[] arr, int left, int right)
	{
		int j = left;
		int i = left -1;
		int p = right;
		
		for (int x = 0; x < p; x++)
		{
			j++;
			if (arr[j] < arr[p])
			{
				i++;
				int temp = arr[j];
				arr[j] = arr [i];
				arr[i] = temp;
			}
		}
		
		p = (i + 1);
		return p;
		
	}

}
