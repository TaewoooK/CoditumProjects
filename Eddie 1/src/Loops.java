import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
	
		String choice;
		choice="";
		
		//For loop practice
		int temp;
		int x1=1;
		int x2=1;
		for(int i=0;i<10;i++){
			temp=x1;
			x1=x1+x2;
			x2=temp;
			
			System.out.println(x1);
		}
	
		//While loops practice
		Scanner user=new Scanner (System.in);
		
		while(!choice.equals("exit")){
			System.out.println("Type exit to close.");
		choice=user.nextLine();
		}
		
	
		
		
	}
	


}
