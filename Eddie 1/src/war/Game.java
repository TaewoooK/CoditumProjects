package war;

import java.util.ArrayList;

public class Game {
	public static void main(String[] args) 
	{
		Deck d= new Deck();
		d.shuffle();	
		//d.splitDeck(); //fix this
	//	d.printDeck();
		d.placeCards();
	}
	

}
