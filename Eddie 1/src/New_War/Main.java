package New_War;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Scanner user = new Scanner(System.in);

		Deck deckofcards = new Deck();
		Deck p1 = new Deck();
		Deck p2 = new Deck();
		int p1card1val, p1card2val, p1card3val;
		int p2card1val, p2card2val, p2card3val;
		boolean check = true;


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

		//Shuffles deck
		deckofcards.shuffle();

		//Splits deck in half for each player

		for (int i = 0; i < 26; i++)
		{
			p2.putBackCard(deckofcards.dealCard());
		}
		for (int i = 0; i < 26; i++)
		{
			p1.putBackCard(deckofcards.dealCard());
		}

		// ||| GAME OFFICALLY STARTS |||


		System.out.println("||| The Game of War |||");
		System.out.println(" ");
		System.out.println("PRESS ENTER TO DEAL CARDS");

		while(p1.dealCard() != null || p2.dealCard() != null)
		{
			Card p1card1, p1card2, p1card3;
			Card p2card1, p2card2, p2card3;



			//String userin = user.nextLine();

			//Deals top card
			Card p1card = p1.dealCard();
			Card p2card = p2.dealCard();
			checkForWinner(p1card, p2card);

			//Gets the value of the top card
			int p1val = p1card.getValue();
			int p2val = p2card.getValue();

			//Prints out the card
			System.out.println("P1: " + p1card);
			System.out.println("P2: " + p2card);

			//Checks to see which card wins
			if (p1val > p2val)
			{
				p1.putBackCard(p1card);
				p1.putBackCard(p2card);

				//	System.out.println(p1.toString());
				//	System.out.println(p2.toString());
			}
			else if (p2val > p1val)
			{
				p2.putBackCard(p2card);
				p2.putBackCard(p1card);
			}
			else if (p1val == p2val)
			{
				System.out.println("=========================================================================================");
				System.out.println("WAR HAS BEGUN!");
				System.out.println("=========================================================================================");

				check = true;
				while(check == true)
				{
					System.out.println("PRESS ENTER TO PLACE DOWN THREE CARDS");

					String userin = user.nextLine();

					//Player one deals 3 cards
					p1card1 = p1.dealCard();

					p1card2 = p1.dealCard();
					p1card3 = p1.dealCard();

					//Player two deals 3 cards
					p2card1 = p2.dealCard();
					p2card2 = p2.dealCard();
					p2card3 = p2.dealCard();

					checkForWinner2(p1card, p2card, p1card1, p1card2, p1card3, 
							p2card1,  p2card2, p2card3);

					//Get value
					p1card1val = p1card1.getValue();
					p1card2val = p1card2.getValue();
					p1card3val = p1card3.getValue();

					p2card1val = p2card1.getValue();
					p2card2val = p2card2.getValue();
					p2card3val = p2card3.getValue();

					//Print out three values
					System.out.println("P1 CARD 1: " + p1card1);
					System.out.println("P2 CARD 1: " + p2card1);

					Thread.sleep(1000);

					System.out.println("P1 CARD 2: " + p1card2);
					System.out.println("P2 CARD 2: " + p2card2);

					Thread.sleep(1000);

					System.out.println("P1 CARD 3: " + p1card3);
					System.out.println("P2 CARD 3: " + p2card3);

					//Adds up the values
					int p1total = p1card1val + p1card2val + p1card3val;
					int p2total = p2card1val + p2card2val + p2card3val;

					//Checks to see who wins the war

					check = true;

					if (p1total > p2total)
					{
						System.out.println("P1 WINS THIS WAR");

						check = false;

						p1.putBackCard(p2card);
						p1.putBackCard(p2card1);
						p1.putBackCard(p2card2);
						p1.putBackCard(p2card3);

					}
					else if (p2total > p1total)
					{
						System.out.println("P2 WINS THIS WAR");

						check = false;

						p2.putBackCard(p1card);
						p2.putBackCard(p1card1);
						p2.putBackCard(p1card2);
						p2.putBackCard(p1card3);
					}
					else if(p1total == p2total)
					{

						System.out.println("");
						System.out.println("=========================================================================================");
						System.out.println("ANOTHERWAR HAS BEGUN!");
						System.out.println("=========================================================================================");


						p1.putBackCard(p1card);
						p1.putBackCard(p1card1);
						p1.putBackCard(p1card2);
						p1.putBackCard(p1card3);

						p2.putBackCard(p2card);
						p2.putBackCard(p2card1);
						p2.putBackCard(p2card2);
						p2.putBackCard(p2card3);


					}
				}
			}
			System.out.println(" ");
			System.out.println("PRESS ENTER TO DEAL CARDS");
		}
	}
	public static void checkForWinner(Card p1card, Card p2card)
	{
		if (p1card == null)
		{
			System.out.println(" ");
			System.out.println("PLAYER 2 WINS!");
			System.exit(0);

		}
		if (p2card == null)
		{
			System.out.println(" ");
			System.out.println("PLAYER 1 WINS!");
			System.exit(0);
		}
	}

	public static void checkForWinner2(Card p1card, Card p2card, Card p1card1, Card p1card2, Card p1card3, 
			Card p2card1, Card p2card2, Card p2card3)
	{
		if (p1card == null || p1card1 == null || p1card2 == null || p1card3 == null)
		{
			System.out.println(" ");
			System.out.println("PLAYER 2 WINS!");
			System.exit(0);
		}
		else if (p2card == null || p2card1 == null || p2card2 == null || p2card3 == null)
		{
			System.out.println(" ");
			System.out.println("PLAYER 1 WINS!");
			System.exit(0);
		}
	}

}
