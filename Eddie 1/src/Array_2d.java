
public class Array_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int[][] intarray= new int[3][8];

		for(int i=0;i<intarray.length;i++)
		{
			for(int j=0;j<intarray[i].length;j++)
			{
				intarray[i][j]=i*j;
			}
			
		}
		
		for(int y=0;y<intarray.length;y++)
		{
			for(int x=0;x<intarray.length;x++)
			{
				System.out.print(intarray[y][x] + " ");
			}
	System.out.println(" ");
		}
	
	
	
	
	}

}
