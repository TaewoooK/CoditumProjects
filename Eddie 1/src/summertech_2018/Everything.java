package summertech_2018;

import java.util.Random;
import java.util.Scanner;

public class Everything {

	public static void main(String[] args) {

		Scanner user = new Scanner (System.in);
		String ans = "";
		int ans2 = 0;
		int rn = 0;

		//Hello World
		System.out.println("Hello World!");

		//Madlib
		System.out.println("---------------------");

		System.out.print("Enter a object: ");
		ans = user.next();

		System.out.println("The boy jumped over the " + ans + ".");

		//Quiz Game
		System.out.println("---------------------");

		System.out.println("Welcome to the quiz game");
		System.out.println("Q1: Is the Earth round?");

		ans = user.next();

		if (ans.equals("Yes") || ans.equals("yes"))
			System.out.println("You are correct!");
		else 
			System.out.println("You are incorrect");

		//Rock Paper Scissors
		System.out.println("---------------------");

		Random rand = new Random();

		int c = 1;

		while (c > 0)
		{
			rn = rand.nextInt(3)+1;

			System.out.println("Type 1 for Rock, Type 2 for Paper, Type 3 for Scissors");
			ans2 = user.nextInt();

			if ((rn == 1 && ans2 == 2) || (rn == 2 && ans2 == 3) || (rn == 3 && ans2 == 1))
			{
				System.out.println("You WIN!");
				c--;
			}

			else if ((rn == 1 && ans2 == 1) || (rn == 2 && ans2 == 2) || (rn == 3 && ans2 == 3))
				System.out.println("You Tied... Try again");

			else 
				System.out.println("You lose... Try again");
		}

		//For Loops
		System.out.println("---------------------");

		for (int i = 0; i < 10; i++)
			System.out.print(i + " ");

		System.out.println();

		for (int i = 9; i >= 0; i--)
			System.out.print(i + " ");

		System.out.println();

		//Square
		System.out.println("---------------------");

		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				System.out.print("X ");
			}
			System.out.println();
		}

		//Right Triangle
		System.out.println("---------------------");

		for (int i = 0; i < 5; i++)
		{
			for (int j = i; j < 5; j++)
			{
				System.out.print("X ");
			}
			System.out.println();
		}

		//Equilateral Triangle
		System.out.println("---------------------");

		for (int i = 0; i < 5; i++)
		{
			for (int j = i; j < 5; j++)
				System.out.print(" ");

			for (int h = 0; h < i+1; h++)
				System.out.print("X ");

			System.out.println();
		}

		//Diamond
		System.out.println("---------------------");

		for (int i = 0; i < 5; i++)
		{
			for (int j = i; j < 5; j++)
				System.out.print(" ");

			for (int h = 0; h < i+1; h++)
				System.out.print("X ");

			System.out.println();
		}

		for (int i = 0; i < 5; i++)
		{
			for (int h = 0; h < i+2; h++)
				System.out.print(" ");

			for (int j = i + 1; j < 5; j++)
				System.out.print("X ");

			System.out.println();
		}

		//Hollow Diamond
		System.out.println("---------------------");

		for (int i = 0; i < 5; i++)
		{
			for (int j = i; j < 5; j++)
				System.out.print(" ");

			for (int h = 0; h < i + 1; h++)
					System.out.print("X ");
			

			System.out.println();
		}

		for (int i = 0; i < 5; i++)
		{
			for (int h = 0; h < i+2; h++)
				System.out.print(" ");

			for (int j = i + 1; j < 5; j++)
			{
				if (j == i + 1)
					System.out.print("X ");
				else 
					System.out.print(" ");
			}

			for (int j = i + 1; j < 5; j++)
			{
				if (j == 3)
					System.out.print("X ");
				else 
					System.out.print(" ");
			}
			
			System.out.println();
		}





	}

}
