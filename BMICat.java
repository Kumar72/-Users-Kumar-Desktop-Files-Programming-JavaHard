package Exercises;

import java.util.Scanner;

public class BMICat {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double m, kg, bmi, lbs, in, ft;; 

System.out.print("Your height (feet only): ");
		ft = keyboard.nextDouble();
		System.out.print("Your height (inches): ");
		in = keyboard.nextDouble();
		
		m = ((ft* 12) + in) * 0.0254;

		System.out.print("Your weight in pounds: ");
		lbs = keyboard.nextDouble();
		kg = lbs * 0.4536;

		bmi = kg/(m * m);

		System.out.println("\nYour BMI is "+bmi);


	//	System.out.print("\nEnter your BMI: ");
	//	bmi = keyboard.nextDouble();

		System.out.print("BMI category: ");
		if (bmi < 15) {
			System.out.println("very severely underweight");
		}
		else if (bmi <=16) {		//SD1: taking away the if didn't really change the code much? 
			System.out.println("severely underweight");
		}
		else if (bmi < 18.5) {
			System.out.println("underweight");
		}
		else if (bmi < 25) {
			System.out.println("normal weight");
		}
		else if (bmi < 30) {
			System.out.println("overweight");
		}
		else if (bmi < 35) {
			System.out.println("moderately obese");
		}
		else if (bmi < 40) {
			System.out.println("severely obese");
		}
		else {
			System.out.println("very severely/\"morbidly\" obese");
		}
		System.out.print("\n");

	}
}

