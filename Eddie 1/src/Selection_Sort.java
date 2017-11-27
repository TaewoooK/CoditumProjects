
public class Selection_Sort {

	public static void main(String[] args) {

		int []SelArray= {33,2,52,106,73};
		int small=SelArray[0];

		for (int i=0;i<SelArray.length;i++)
		{
			System.out.print(SelArray[i]+ " ");
		}
		System.out.println();
		
		for(int n=1; n<SelArray.length;n++)
		{
			if (SelArray[n]<small)
			{
				small= SelArray[n];
				System.out.println (small);
			}

		}

	}

}
