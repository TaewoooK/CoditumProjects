package New_War;

public class Card {

	private int value;
	private int suit;

	public Card(int suit, int value) 
	{
		this.value = value;
		this.suit = suit;
	}

	public int getValue()
	{
		return value;
	}

	public int getSuit()
	{
		return suit;
	}

	public String toString()
	{
		if (suit == 0)
		{
			if (value == 11)
				return "Jack of Clovers";
			if (value == 12)
				return "Queen of Clovers";
			if (value == 13)
				return "King of Clovers";
			if (value == 14)
				return "Ace of Clovers";
			else
				return value + " of Clovers";
		}
		if (suit == 1)
		{
			if (value == 11)
				return "Jack of Hearts";
			if (value == 12)
				return "Queen of Hearts";
			if (value == 13)
				return "King of Hearts";
			if (value == 14)
				return "Ace of Hearts";
			else
				return value + " of Hearts";
		}
		if (suit == 2)
		{
			if (value == 11)
				return "Jack of Diamonds";
			if (value == 12)
				return "Queen of Diamonds";
			if (value == 13)
				return "King of Diamonds";
			if (value == 14)
				return "Ace of Diamonds";
			else
				return value + " of Diamonds";
		}
		else
		{
			if (value == 11)
				return "Jack of Spades";
			if (value == 12)
				return "Queen of Spades";
			if (value == 13)
				return "King of Spades";
			if (value == 14)
				return "Ace of Spades";
			else
				return value + " of Spades";
		}

	}

}
