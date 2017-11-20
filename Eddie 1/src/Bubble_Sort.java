
public class Bubble_Sort {

	public static void main(String[] args) {

		int []array= {8, 6, 3, 10, 2, 55};

		for (int i=1; i<array.length;i++)
		{
			int a=i-1;
			int b=i;
			int temp=0;

			if (array[b]<array[a])
			{
				temp =array[a];
				array[a]=array[b];
				array[b]=temp;

			}

		}

		for (int h=0;h<array.length; h++)
		{
			System.out.print(array[h]+ " ");
		}










	}

}
