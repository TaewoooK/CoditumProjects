package war;

import java.util.Random;

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
		Random rand = new Random();
		for (int i=0;i<100;i++)
		{
			int a= rand.nextInt(52);
			int b= rand.nextInt(52);


			Card c =cards[a];
			cards[a]=cards[b];
			cards[b]=c;
		}


	}

}
