
public class Insertion_Sort {

	public static void main(String[] args) {

		int []insertion={6,8,3,10,2,55};

		sort(insertion);



	}

	public static void sort(int []array)
	{	
		for (int i=1;i<array.length;i++)
		{
			int j=i-1;
			int position=array[i];
			int temp=0;

			while (j>=0 && position<array[j])
			{	
				temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;

				j=j-1;	
			}			
			array[j+1]=position;
		}
		for (int h=0; h<array.length;h++)
		{
			System.out.print(array[h]+ " ");
		}

	}

}
