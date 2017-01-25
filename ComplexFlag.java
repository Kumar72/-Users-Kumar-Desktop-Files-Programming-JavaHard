package Exercises;
import static java.lang.System.*;

public class ComplexFlag {
	public static void main(String[] args) {
		printTopHalf();

		print48Colons();
		print48Ohs();
		print48Colons();
		print48Ohs();
		print48Colons();
		print48Ohs();
		out.println(" _______________________________________________ ");
		printPledge();



	}

	public static void print48Colons() {
		out.println("|:::::::::::::::::::::::::::::::::::::::::::::::|");
	}

	public static void print48Ohs() {
		out.println("|OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO|");
	}

	public static void print29Colons() {
		out.println("|::::::::::::::::::::::::::::|");
	}
	
	public static void printPledge() {
		out.println("\n\tI pledge allegiance to the flag.\n");
	}

	public static void print29Ohs() {
		out.println("|OOOOOOOOOOOOOOOOOOOOOOOOOOOO|");
	}

	public static void print6Stars() {
		out.print("|* * * * * * * * *|");
	}

	public static void print5stars() {
		out.print("| * * * * * * * * |");
	}

	public static void printSixStarLine() {
		print6Stars();
		print29Ohs(); 
	}

	public static void printfiveStarLine() {
		print5stars();
		print29Colons();
	}

	public static void printTopHalf() {
		out.println(" _______________________________________________ ");
		printSixStarLine();
		printfiveStarLine();
		printSixStarLine();
		printfiveStarLine();
		printSixStarLine();
		printfiveStarLine();
		printSixStarLine();
	}

}

// we create a function erebor (in line 12-14) and then we bringit in line 6 & 8
// Study skill 
// 1. taking away the () after erebor results in a compilar error
// 2. deleting the erebor function or hiding it with // will just omit it from the result