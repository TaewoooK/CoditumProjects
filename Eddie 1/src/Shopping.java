import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {

		String[]shoparray=new String[5];

		shoparray[0]="Apples";
		shoparray[1]="Pears";
		shoparray[2]="Limes";
		shoparray[3]="Noodles";
		shoparray[4]="Water";

		String[]cartarray=new String[3];
		int itemsincart=0;

		boolean go = true;
		Scanner user=new Scanner (System.in);

		while(go == true)
		{
			System.out.println("Type 1 for Store. Type 2 for Cart. Type 3 to Check out");
			int x=user.nextInt();
			user.nextLine();

			if (x==1)
			{
				for(int e=0;e<5;e++)
				{
					System.out.println(shoparray[e]);	
				}
			}
			if (x==2 && itemsincart<cartarray.length)
			{
				for(int e=0;e<5;e++)
				{
					System.out.println(shoparray[e]);	
				}

				System.out.println("What do you want in your cart?");
				String y=user.nextLine();

				for(int e=0;e<5;e++)
				{
					if(y.equals(shoparray[e]))
					{
						cartarray[itemsincart]=shoparray[e];
						itemsincart=itemsincart+1;

						shoparray[e]="Empty";

						if (cartarray.length==itemsincart)
						{
							System.out.println("YOUR CART IS FULL. PLEASE CHECK OUT.");	

						}


						for(int c=0;c<3;c++)
						{
							System.out.println(cartarray[c]);
						}

					}
				}
			}

			if (x==3)
			{
				System.out.println("Have a good day!");
				go=false;
			}


		}



	}

}
