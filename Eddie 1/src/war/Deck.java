package war;
// Try to print out whole deck
public class Deck {

	private Card[] cards;

	public Deck()
	{
		cards= new Card[52];
		for (int i=0;i<4;i++)
		{
			for (int x=0;x<13;x++)
			{
				if (i==0)
				{
					cards[x] = new Card(x, "Hearts");				
				}
				if (i==1)
				{
					cards[x] = new Card(x, "Spades");
				}
				if (i==2)
				{
					cards[x] = new Card(x, "Diamonds");
				}
				if (i==3)
				{
					cards[x] = new Card(x, "Clovers");
				}

			}
		}
		printDeck();
	}

	public void printDeck()
	{
		for(int y=0;y<52;y++)
		{
			System.out.println(cards[y]);
		}
	}
}
