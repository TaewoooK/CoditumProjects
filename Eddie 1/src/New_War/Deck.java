package New_War;

import java.util.ArrayList;

public class Deck {

	private ArrayList<Card> deck;
	
	public Deck() {
		deck = new ArrayList<Card>();
		for (int i=0; i <5; i++)
		{
			for (int j=2; j < 15; j++)
			{
				deck.add(new Card(i, j));
			}
		}
		
	}
	
	public Card dealCard()
	{
		if (!deck.isEmpty())
			return deck.remove(0);
		return null;
	}

	public void putBackCard(Card card)
	{
		deck.add(card);
	}
	
	public void shuffle()
	{
		for (int i=0; i <deck.size(); i++)
		{
			int rand = (int)(Math.random()*52);
			Card a = deck.get(i);
			Card b = deck.get(rand);
			
			deck.set(rand, a);
			deck.set(i, b);
		}
	}
	
	
	
	
}
