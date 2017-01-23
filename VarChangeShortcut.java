package JavaHard;

import java.util.Scanner;

public class VarChangeShortcut {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int i, j, k;

		i = 5;
		j = 5;
		k = 5;
		System.out.println("i: "+i+"\tj: "+j+"\tk: "+k);
		i = i + 3;
		j = j - 3;
		k = k * 3;
		System.out.println("i: "+i+"\tj: "+j+"\tk: "+k+"\n");


		i = 5;			//Compound assignment operator
		j = 5;
		k = 5;
		System.out.println("i: "+i+"\tj: "+j+"\tk: "+k);
		i += 3;   		//shortcut for doing mathical opperation with i, j, and k
		j -= 3;			// i += 3 is the same as i = i + 3 and so on...
		k *= 3;
		System.out.println("i: "+i+"\tj: "+j+"\tk: "+k+"\n");


		i = j = k = 5;
		System.out.println("i: "+i+"\tj: "+j+"\tk: "+k);		
		i += 1;
		j -= 2;
		k *= 3;
		System.out.println("i: "+i+"\tj: "+j+"\tk: "+k+"\n");


		i = j = 5;
		System.out.println("i: "+i+"\tj: "+j);
		i =+ 1;		// adding the operations after the = sign just sets  var to the value
		j =- 2;
		System.out.println("i: "+i+"\tj: "+j+"\n");

		i = j = 5;	//post-increment operator => i++; post-decrement operator => j--
		System.out.println("i: "+i+"\tj: "+j);
		i ++;		//another shortcut but this one doesn't require = sign
		j --;
		System.out.println("i: "+i+"\tj: "+j+"\n");

//study drills 
		i = j = k = 5; 
		i -= 5;
		System.out.println("i: "+i);
		i = 5;
		i ++; 
		System.out.println("i: "+i);

	}
}

