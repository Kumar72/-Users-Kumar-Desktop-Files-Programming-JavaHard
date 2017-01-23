package Exercises;

import static java.lang.System.*;		//use if you don't wanna write System everytime
import java.util.Scanner;

public class CollegeAdm {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int math;

		out.println("\nWelcome to the Baylor College Admissions Interface!");
		out.print("Please enter your SAT math score (200-800): ");
			math = keyboard.nextInt();


// Since we are only using one statement per condition, we don't need {}
		out.print("Admittance status: ");
		if (math >= 790) 		//the first if statment has to be the hardest to achieve
			out.print("CERTAIN");
		else if (math >= 710)
			out.print("SAFE");
		else if (math >= 580)
			out.print("PROBABLE");
		else if (math >= 500)
			out.print("UNCERTAIN");
		else if (math >= 390)
			out.print("UNLIKELY");
		else 		//below 390
			out.print("DENIED");
		
		out.println();

	}
}

//  object-oriented code are built-in objects in Java like SYSTEM
//  inside the object SYSTEM there is another object named OUT
//  the object named OUT contains a method called print() / println()
//  so what we did was import all static items insde the class java.lang.System into the current namespace
//  this works as long as we don't decide to have a variable named out
//  else this won't compile since out is an object now. 


//Study drills:
// 1. if we take away all the else (accept the last one, it will print all the commands for which the value is)
// 2. changing the order like putting the else if (math >=390) right after the first if will result in unlikely for almost all vales except if 790. 