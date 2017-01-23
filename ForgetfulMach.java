package JavaHard;

import java.util.Scanner;

public class ForgetfulMach {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);  	//name the scanner keyboard and get info from system (System.in)
		System.out.println("What city is the capital of India?");
		keyboard.next();

		System.out.println("What is 6 multiplied by 7?");
		keyboard.nextInt();		    //stores it as an integer value

		System.out.println("Enter a number between 0.0 and 1.0.");
		keyboard.nextDouble();		//stores is as a floating point

		System.out.println("Is there anything else you would like to say?");
		keyboard.next();

	}
}

// The second Q's blows up if the value is not an integer, so a fractional value or a word with stop the program
// The third Q's will blow up if we write a word or a phrase.