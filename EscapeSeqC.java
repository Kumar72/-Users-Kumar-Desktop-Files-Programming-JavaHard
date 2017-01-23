
package JavaHard;
//This ex. demonstrate escape sequences & comments 

public class EscapeSeqC{
	public static void main(String[] args) {

		System.out.print("Lear\tJava\n\tthe\nHard\tWay\n\n");
		System.out.println("\tLear Java the \"Hard\"Way!\n");
			//System.out.frimp("learn Java the Hard Way");
		System.out.println("Helo\n");
			//This line prints Hello
		System.out.print("Jello\by\n");
			//This line prints Jelly
	/*
	The quick brown fox jumped over a lazy dog. 
	Quick wafting zepheyrs vex bold Jim. 
	*/
		System.out.print/*testing*/ln("Hard to believe, eh?");
		System.out.println("Surprised? /* abcde */ Or what did you expect?");
		
		System.out.println("\\//-=-\\//");
		System.out.println( "\\\\ \\\\\\ \\\\\\\\" );
			// it takes 2 to make 1
		System.out.print("I hope you understand \"escape sequences \"now.\n");
			// and comments.
	}
}

/*
	\t = tab
	\n = new line
	\" = "
	\b = backspace (deletes the last character) 
	\\ = \
*/
