
public class Array_Loops {

	public static void main(String[] args) {
	
		int[]onearray=new int[7];
	
		for (int x=0;x<7;x++)
		{
			onearray[6-x]=x+1;
		}
		
		for (int x=0;x<7;x++)
		{
			onearray[x]=onearray[x]*2;
		}
		
		for (int x=0;x<7;x++)
		{			
			
			System.out.println(onearray[x]);	
		}
		
		
		

	}

}
