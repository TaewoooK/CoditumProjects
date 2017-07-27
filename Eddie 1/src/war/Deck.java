package war;

import java.util.Random;

// Try to print out whole deck
public class Deck {

	private Card[] cards;

	public Deck()
	{
		int l=0;
		cards= new Card[52];
		for (int i=0;i<4;i++)
		{
			for (int x=0;x<13;x++)
			{
				if (i==0)
				{
					cards[l] = new Card(x+1, "Hearts");				
				}
				if (i==1)
				{
					cards[l] = new Card(x+1, "Spades");
				}
				if (i==2)
				{
					cards[l] = new Card(x+1, "Diamonds");
				}
				if (i==3)
				{
					cards[l] = new Card(x+1, "Clovers");
				}
				l++;

			}
		}
		
	}

	public void printDeck()
	{
		for(int y=0;y<52;y++)
		{
			System.out.println(cards[y]);
		}
	}
	
	public void shuffle()
	{
		int c=0;
		Random rand = new Random();
		int a= rand.nextInt(52);
		int b= rand.nextInt(52);
		
		
		cards[c]=cards[a];// do this later
		cards[a]=cards[b];
		cards[b]=cards[c];
		

	}
	
}
