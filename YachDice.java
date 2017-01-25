package Exercises;

public class YachDice {
	public static void main( String[] args) {
		int r1, r2, r3, r4, r5, r6;
		boolean allSame;

		do {
			r1 = 1 +(int)(6*Math.random());
			r2 = 1 +(int)(6*Math.random());
			r3 = 1 +(int)(6*Math.random());
			r4 = 1 +(int)(6*Math.random());
			r5 = 1 +(int)(6*Math.random());
			r6 = 1 +(int)(6*Math.random());
			System.out.println("\nYou rolled: "+r1+" "+r2+" "+r3+" "+r4+" "+r5+" "+r6);
			showDice(r1);	//we are finding the match to our var in another function
			showDice(r2);	//and then projecting it back in our main function (pretty cool)
			showDice(r3);
			showDice(r4);
			showDice(r5);
			showDice(r6);
			allSame = (r1 == r2 && r2 == r3 && r3 == r4 && r4 == r5 && r5 == r6);

		}
		while (! allSame);
		
		System.out.println("The Yacht!!");

	}
//if we didn't do the showDice func. we would have had to write it 5 times (one/variable)
	public static void showDice( int roll) { // we have identified a var inside () called roll - we call this a parameter
		System.out.println("+---+");
		if (roll == 1) {
			System.out.println("|   |");
			System.out.println("| o |");
			System.out.println("|   |");
		}
		else if (roll == 2) {
			System.out.println("|o  |");
			System.out.println("|   |");
			System.out.println("|  o|");
		}
		else if (roll == 3) {
			System.out.println("|o  |");
			System.out.println("| o |");
			System.out.println("|  o|");
		}
		else if (roll == 4) {
			System.out.println("| o |");
			System.out.println("|o o|");
			System.out.println("| o |");
		}
		else if (roll == 5) {
			System.out.println("|o o|");
			System.out.println("| o |");
			System.out.println("|o o|");
		}
		else if (roll == 6) {
			System.out.println("|o o|");
			System.out.println("|o o|");
			System.out.println("|o o|");
		}
		System.out.println("+---+");
	}
}

/*
parameter: the variable insdie the () of another public static void ___
	this allows us to speficify showDice to a value such as (r1) or (r2)...
	if we left showDice as (), it won't compile ...this is an ex of an argument 
	therefore, if we input boolean, string, or double values, this won't work


*/