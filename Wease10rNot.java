package JavaHard;

import java.util.Scanner;

public class Wease10rNot {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String word;
		boolean yep, nope;

		System.out.println("Type the word \"wease1\", please.");
		word = keyboard.next();

		yep = (word+"wease1").equals;		//word.equal is a way to compare two stings
		nope = !word.equals("wease1");		//! used for the difference 

		System.out.println("You typed what was requested: "+ yep);
		System.out.println("You typed what was requested: "+ nope);

	}
}

