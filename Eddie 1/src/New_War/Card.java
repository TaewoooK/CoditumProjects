package New_War;

public class Card {

	public final int CLUBS = 0;
	public final int HEARTS = 1;
	public final int SPADES = 2;
	public final int DIAMONDS = 3;
	public final int JACK = 11;
	public final int QUEEN = 12;
	public final int KING = 13;
	public final int ACE = 14;
	
	private int value;
	private int suit;
	
	public Card(int value, int suit) 
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
		return value + " of" + suit;
	}

}
