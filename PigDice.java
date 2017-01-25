package Exercises;

import java.util.Scanner;

public class PigDice {		// need to be fixed: it lets me roll even though I have 21 pts; and doesn't stop even when I have 100 pts
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int roll, ptot, ctot, turnTotal;
		String choice = "";

		ptot = 0;		//holds the player's total
		ctot = 0;		//holds the computer's total

		do {			//makes sure the program runs until either ptot or ctot > 100 
			turnTotal = 0;
			System.out.println("You have "+ptot+" points.");

			do {		//controls the dice roll and what to do when you write roll or hold when you reach while 
				roll = 1 + (int)(Math.random()*6); 	//roll the dice
				System.out.println("\tYou rolled a "+roll+".");
				if (roll == 1) {					//condition: roll = 1 END TURN
					System.out.println("\tThat ends your turn.");
					turnTotal = 0;

				}
				else{								//else add to total and ask to roll or hold 
					turnTotal += roll;
					System.out.print("\tYou have "+turnTotal+" points so far this round. \n");
					System.out.print("\tWould you like to \"roll\" again or \"hold\"? ");
					choice = keyboard.next();
				}
			}
			while (roll !=1 && choice.equals("roll"));
			ptot += turnTotal;
			System.out.println("\tYou end the round with "+ptot+" points.");

			if (ptot < 100) {
				turnTotal = 0; 			//start of computers turn
				System.out.println("Computer has "+ctot+" points.");

				do {
					roll = 1+(int)(Math.random()*6);
					System.out.println("\tComputer rolled a "+roll+".");
					if (roll == 1) {	//end turn if computer rolls 1
						System.out.println("\tThat ends its turn.");
						turnTotal = 0;

					}

					else if (ctot >= 100) {
						ctot += turnTotal;
				System.out.print("\tComputer ends the round with ");
				System.out.print(ctot+" points. \n");

					}
					else {
						turnTotal += roll;
						System.out.print( "\tComputer has "+ turnTotal);
						System.out.print("poitns so far this round. \n"); 
						if (turnTotal < 20) {
							System.out.println("\tComputer will roll again.");
						}
					}
				}
				while (roll !=1 && turnTotal < 20);

				ctot += turnTotal;
				System.out.print("\tComputer ends the round with ");
				System.out.print(ctot+" points. \n");

			}
			
		}
		while (ptot < 100 & ctot <100);

		if (ptot >ctot) { 		//if and else statement to determine the winner
			System.out.println("Humanity wins!");

		}
		else {
			System.out.println("The computer wins.");

		}
	}
}
