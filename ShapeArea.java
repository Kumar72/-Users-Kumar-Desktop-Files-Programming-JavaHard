package Exercises;

import java.util.Scanner;

public class ShapeArea {
	public static void main( String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int choice; 
		double area = 0;

		System.out.print("SHape Area Calculator version 0.1");
		System.out.println("(c) 2017 CKTEx Sample Output, INC.");


		do {
			System.out.println("\n-==========================-\n");
			System.out.println("1) Triangle");
			System.out.println("2) Circle");
			System.out.println("3) Rectangle");
			System.out.println("4) Square");
			System.out.println("5) Quit");
			System.out.print(">  ");
			choice = keyboard.nextInt();

			if (choice == 1) {
				System.out.print("\nBase: ");
				int b = keyboard.nextInt();
				System.out.print("\nHeight: ");
				int h = keyboard.nextInt();
				area = computeTriangleArea (b, h);
				System.out.println("The area is "+area);
			}
			else if (choice == 2) {
				System.out.print("\nRadius: ");
				int r = keyboard.nextInt();
				area = computeCircleArea(r);
				System.out.println("The area is "+area);
			}
			else if (choice == 3) {
				System.out.print("\nLenght: ");
				int l = keyboard.nextInt();
				System.out.print("\nWidth: ");
				int w = keyboard.nextInt();
				System.out.println("The area is "+computeRectangleArea (l, w));
			}
			else if (choice == 4) {
				System.out.print("\nLenght: ");
				int s = keyboard.nextInt();
				System.out.println("The area is "+computeSquareArea(s));
			}
			else if (choice !=5) {
				System.out.println("ERROR.");
			}
			
		}
		while (choice !=5); 

	}
	
	public static double computeTriangleArea (int base, int height) {
		double A;
		A = 0.5*base*height;
		return A;
	}
	public static double computeCircleArea (int radius) {
		double A;
		A = Math.PI*radius*radius;
		return A;
	}
	public static double computeRectangleArea (int lenght, int width) {
		
		return (lenght*width);
	}
	public static double computeSquareArea (int lenght) {
		return (lenght*lenght);
	}

}

/*
	In java function can only return a single value (as long at it isn't void in which case it returns nothing)
	
*/

