
public class Array_Modified_With_Functions {

	public static void main(String[] args) {
int[]arrayone=new int [9];

		
		for(int x=0;x<7;x++)
		{
			arrayone[x]=x*2;
			System.out.println(arrayone[x]);
		}
		
		System.out.println(" ");
		
		functionone(arrayone);

		for(int x=0;x<7;x++)
		{
			System.out.println(arrayone[x]);
		}


	}
	
	public static void functionone(int []farray)
	{
		int last=farray[0];
		int length=farray.length;
		
		for(int x=0;x<length-1;x++)
		{
			farray[x]=farray[x+1];
		}
	
		farray[length-1]=last;
	
	
	}

}
