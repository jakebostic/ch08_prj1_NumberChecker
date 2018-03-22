
public class NumberCheckerApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Odd/Even Checker!");
		System.out.println();
		
		
		String choice = "y";
		MyConsole mc = new MyConsole();
		while (choice.equalsIgnoreCase("y")) {
			int number = mc.getInt("Enter an integer: ");
			String oddEven = "odd";
			if (number % 2 == 0) {
				oddEven = "even";
			}
			
		System.out.println("The number "+ number + " is " + oddEven + "\n");
		choice = mc.getString("Continue? (y/n): ");
		System.out.println();
		}

	}

}
