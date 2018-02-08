public class Merge_Sort {

	public static void main(String[] args) {

		int []arr = {2, 4, 1, 3, 6, 5, 7, 8};

		System.out.println("Before:");

		for (int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		mergesort(arr, 0, arr.length-1);

		for (int i=0; i<arr.length; i++)
		{	
		System.out.print(arr[i] + " ");
		}

	}

	public static void mergesort(int []arr, int left, int right )
	{
		if (left<right)
		{
			int mid = (left + right)/2;
			mergesort(arr, left, mid);
			mergesort (arr, mid+1, right);
			merge(arr, left, mid, right);
		}	

	}

	public static void merge(int []arr, int left, int mid, int right)
	{
		int lsize= mid-left+1;
		int rsize= right-mid;
		
		int L[]=new int[lsize];
		int R[]=new int[rsize];

		for (int i=0;i<lsize;++i)
		{
			L[i]=arr[left+i];
		}
		for (int j=0;j<rsize;++j)
		{
			R[j]= arr[mid+1+j];
		}

		int i=0;
		int j=0;
		int x=left;
		
		while (i<lsize && j<rsize)
		{
			if (L[i]<= R[j])
			{
				arr[x]=L[i];
				i++;
			}
			else 
			{
				arr[x]=R[j];
				j++;
			}	
			x++;
		}

		while (i<lsize)
		{
			arr[x]=L[i];
			i++;
			x++;
		}
		
		while (j<rsize)
		{
			arr[x]=R[j];
			j++;
			x++;
		}
		
	}

}
