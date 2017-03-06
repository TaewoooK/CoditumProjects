
public class Array {

	public static void main(String[] args) {

		String[]myarray=new String[5];

		myarray[0]="Bob";
		myarray[1]="Ryan";
		myarray[2]="Tom";
		myarray[3]="Michael";
		myarray[4]="Joel";

		//System.out.println(myarray[0]);

		//for(int i=0;i<5;i++)
		//{
		//myarray[i]=i+1;	
		//System.out.println(myarray[i]);

		//}

		for(int i=0;i<5;i++)
		{
			System.out.println(myarray[i]);

		}

		myarray[2]="Kyle";

		for(int i=0;i<5;i++)
		{
			System.out.println(myarray[i]);

		}


		//for(int i=0;i<5;i++)
		//{
		//System.out.println(myarray[i]);

		//	}
	}

}
