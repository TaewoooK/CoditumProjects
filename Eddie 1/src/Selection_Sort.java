
public class Selection_Sort {

	public static void main(String[] args) {

		int []SelArray= {33,2,52,108,73};

		for (int i=0;i<SelArray.length;i++)
		{
			System.out.print(SelArray[i]+ " ");
		}
		System.out.println();
		System.out.println("After Selection Sorting...");
		int indx =0;

		for (int x=1;x<SelArray.length;x++)
		{
			int small=SelArray[x-1];
			boolean newsmall = false;

			for(int n=x; n<SelArray.length;n++)
			{
				if (SelArray[n]<small)
				{
					small = SelArray[n];
					indx = n;
					newsmall = true;
				}
			}

			if(newsmall)
			{
				int temp = SelArray[x-1];
				SelArray[x-1]=small;
				SelArray[indx]=temp;
				//	System.out.println(small);
			}
		}

		for (int i=0;i<SelArray.length;i++)
		{
			System.out.print(SelArray[i]+ " ");
		}
		System.out.println();

	}
}
