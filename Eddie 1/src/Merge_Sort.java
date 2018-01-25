
public class Merge_Sort {

	public static void main(String[] args) {

		int []arr = {33,2,52,108,73,22,12,78};


		System.out.println("Before:");
		for (int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		mergesort(arr, 0, arr.length-1);

		System.out.println(merge(arr, 0, (arr.length)/2,arr.length-1));

	}


	public static void mergesort(int []arr, int left, int right )
	{
		int mid = (left + right)/2;
		
		if (right-left!=0)
		{
			mergesort(arr, left, mid);
			mergesort (arr, mid+1, right);
			merge(arr, left, mid, right);
					
		}	
		
	}

	public static int merge(int []arr, int left, int mid, int right)
	{
		int lsize= mid-left+1;
		int rsize= right-mid;
		
		int L[]=new int[lsize];
		int R[]=new int[rsize];
		
		for (int i=0;i<lsize;i++)
		{
			L[i]=arr[left+i];
		}
		for (int j=0;j<rsize;j++)
		{
			R[j]= arr[mid+1+j];
		}
		
		
		
		
		if (mid == (left+right)/2)
		{
			return merge (arr, left, mid, right);
		}
		else 
		{
			if (mid>left)
			{
				merge(arr, left, mid, right );
			}
			else if(left>mid)
			{
				merge (arr, mid, left, right);
			}
			return 0;
		}

	}

}
