package war;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Deck {

	private ArrayList<Card> cards;

	public Deck()
	{
		cards= new ArrayList<Card>();

		for (int i=0;i<4;i++)
		{
			for (int x=0;x<13;x++)
			{
				if (i==0)
				{
					cards.add(new Card(x+1, "Hearts") );				
				}
				if (i==1)
				{
					cards.add( new Card(x+1, "Spades") );
				}
				if (i==2)
				{
					cards.add(new Card(x+1, "Diamonds") );
				}
				if (i==3)
				{
					cards.add( new Card(x+1, "Clovers") );
				}


			}
		}
		
	}
	public Deck(ArrayList<Card> c)
		{
			cards=c;
		}

	/*public void printDeck()
	{
		for(int y=0;y<52;y++)
		{
			System.out.println(cards.get(y));
		}
	}
*/
	public void shuffle()
	{
		Random rand = new Random();
		for (int i=0;i<100;i++)
		{
			int a= rand.nextInt(52);
			int b= rand.nextInt(52);


			Card c =cards.get(a);
			cards.set(a, cards.get(b) );
			cards.set(b, c );
		}

	}
	/*public void splitDeck() //Split deck
	{
		
		for (int z=0;z<26;z++)
		{
			System.out.println(cards.get(z));
		}
		
	}*/
	Scanner input=new Scanner(System.in);
	
	
	public void placeCards()
	{
	for (int i=0;i<52;i++)
	{
		
		System.out.println("Type NEXT to continue!");
		String x= input.next();
		System.out.println(cards.get(i));
		System.out.println(cards.get(i+26) );

	}
		
	}
}
