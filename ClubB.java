package JavaHard;

public class ClubB {
	public static void main(String[] args) {
		
		int age = 25;
		double allure = 7.5;
		boolean onGuestList = false;
		String gender = "F";

		if (onGuestList || age >= 21 || (gender.equals("F") && allure >= 8)) {
			System.out.println("You are allowed to enter the club.");
		}
	//		System.out.println("Clubs are crowded."); if we add this line we cannot compile b/c else has to go right after the end of if
		else {
			System.out.println("You are not allowed to enter the club.");

		}
	}
}