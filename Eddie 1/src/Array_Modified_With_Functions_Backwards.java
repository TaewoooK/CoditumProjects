
public class Array_Modified_With_Functions_Backwards {

	public static void main(String[] args) {
int[]arrayone=new int [7];

		
		for(int x=0;x<7;x++)
		{
			arrayone[x]=x+1;
			System.out.println(arrayone[x]);
		}
		
		System.out.println(" ");
		
		functionone(arrayone);

		for(int x=0;x<7;x++)
		{
			System.out.println(arrayone[x]);
		}


	}
	
	public static void functionone(int [] farray)
	{
		int length= farray.length;
		int first = farray[length-1];
		
		for(int x=length-1;x>0;x--)
		{
			farray[x]=farray[x-1];
		}
	
		farray[0]=first;
	
	
	}

}


