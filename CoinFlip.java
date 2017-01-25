package Exercises;

import java.util.Scanner;

public class CoinFlip {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String coin, again;	
		int streak = 0; 
		boolean gotHeads;
/* 
		do {									//do-while loops
			gotHeads =Math.random() < 0.5;
			if (gotHeads)
				coin = "HEADS";
			else 
				coin = "TAILS";
			System.out.println("You flip a coin and it is ..."+coin);
			
			if (gotHeads) {
				streak++;
				System.out.println("\tThat's "+streak+" in a row...");
				System.out.print("\tWould you like to flip again (y/n)?");
				again = keyboard.next();
			}
			else {
				System.out.println("\tYou loss everything!");
				System.out.println("\tShould've quite while you were aHEAD...");
				streak = 0;
				again = "n";

			}
		}
		while (again.equals("y"));

		System.out.println("Final score: "+streak);
*/		

												//while-loops
		System.out.println("Would you like to flip a coin (y/n)? ");
		again = keyboard.next();

		while (again.equals("y")) {
			gotHeads = Math.random() < 0.5;
			if (gotHeads)
				coin = "HEADS";
			else 
				coin = "TAILS";
			System.out.println("You flip a coin and it is..."+coin);

			if (gotHeads) {
				streak++;
				System.out.println("\tThat's "+streak+" in a row...");
				System.out.print("\tWould you like to flip again (y/n)?");
				again = keyboard.next();
			}
			else {
				System.out.println("\tYou loss everything!");
				System.out.println("\tShould've quite while you were aHEAD...");
				streak = 0;
				again = "n";
			}
		System.out.println("Final score: "+streak);

		}

	}
}

/* differences between while loops and do-while loops
	1. condition for a while loop is before the body
	   condition for the do-while loop is after the body (which is inside do{})
	2. While loops check the condition before going into the loop body
	   do-while loops run the body of the loop once no matter what and only check the condition after the first time through 

   while loops are called "pre-test" loop
   while-do loops are called "post-test" loop
   we can you either of the loops to do the same thing

*/