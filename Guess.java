// ************************************************************
// Guess.java
//
// Play a game where the user guesses a number from 1 to 10
//
// ************************************************************
import java.util.Scanner;
import java.util.Random;
public class Guess
{
	public static void main(String[] args)
	{
		 //Number the user tries to guess
		
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		System.out.println("PLease enter a guess");
		int guess=scan.nextInt();
	int numToGuess=generator.nextInt();
		
		//randomly generate the number to guess
		//print message asking user to enter a guess
		//read in guess
		while ( guess<1 || guess>10) //keep going as long as the guess is wrong
		{
			System.out.println("The guess is wrong");
			System.out.println("Enter another guess");
			scan.nextInt();
			generator.nextInt();
			//print message saying guess is wrong
			//get another guess from the user
		}
		System.out.println(" Congrats! The guess is right");

		//print message saying guess is right
	}
}

