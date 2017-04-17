
public class Practice_Array {

	public static void main(String[] args) {
		
		int[]arrayone=new int [7];
		
		
		for(int x=0;x<7;x++)
		{
			arrayone[x]=x+1;
			System.out.println(arrayone[x]);
		}
		
		System.out.println(" ");
		
		
		for(int x=0;x<6;x++)
		{
			arrayone[x]=arrayone[x+1];
		}
		arrayone[6]=1;

		
		for(int x=0;x<7;x++)
		{
			System.out.println(arrayone[x]);
		}

	
	
	}

}
