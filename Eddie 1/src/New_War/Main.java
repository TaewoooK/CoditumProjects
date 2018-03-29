package New_War;

public class Main {

	public static void main(String[] args) {
		
	Deck deckofcards = new Deck();
	Deck p1 = new Deck();
	Deck p2 = new Deck();
	
	//Empty's out p1's deck
	for (int i = 0; i < 52; i++)
	{
		p1.dealCard();
	}
	
	//Empty's out p2's deck
	for (int i = 0; i < 52; i++)
	{
		p2.dealCard();
	}
	
	System.out.println("||| The Game of War |||");
	
	deckofcards.shuffle();
	
	for (int i = 0; i < 26; i++)
	{
		p1.putBackCard(deckofcards.dealCard());
	}
	for (int i = 0; i < 26; i++)
	{
		p2.putBackCard(deckofcards.dealCard());
	}
	
	Card p1card = p1.dealCard();
	Card p2card = p1.dealCard();
	
	int p1val = p1card.getValue();
	int p2val = p2card.getValue();
	
	System.out.println("P1: " + p1card);
	System.out.println("P2: " + p2card);
	
	if (p1val > p2val)
	{
		p1.putBackCard(p1card);
		p1.putBackCard(p2card);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
	}
	
		
		
		
		
	}

}
