
public class array_numbers_23457 {

	public static void main(String[] args) {

		int[]numberarray=new int [5];	

		for(int x=0;x<5;x++)
		{
			numberarray[x]=x+1;
			System.out.println(numberarray[x]);
		}

		System.out.println("");

		for(int x=0;x<4;x++)
		{
			numberarray[x]=numberarray[x+1];
		}

		numberarray[4]=7;

		for(int x=0;x<5;x++)
		{

			System.out.println(numberarray[x]);
		}


	}

}
