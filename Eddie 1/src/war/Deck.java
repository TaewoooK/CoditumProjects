package war;
// Try to do this
public class Deck {
	
	private Card[] cards;
	
	public Deck(Card[] cards)
	{
		for (int i=0;i<4;i++)
		{
			for (int x=0;x<13;x++)
			{
				if (i==0)
				{
					cards[x] = new Card(i, x);
				}
			}
		}
	}
	
}
