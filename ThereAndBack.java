package Exercises;

public class ThereAndBack {
	public static void main(String[] args) {
		System.out.println("Here.");
		erebor ();
		System.out.println("Back first time.");
	//	erebor();
		System.out.println("Back second time.");
		
	}
	public static void erebor() {
		System.out.println("There.");
	}
}

// we create a function erebor (in line 12-14) and then we bringit in line 6 & 8
// Study skill 
// 1. taking away the () after erebor results in a compilar error
// 2. deleting the erebor function or hiding it with // will just omit it from the result