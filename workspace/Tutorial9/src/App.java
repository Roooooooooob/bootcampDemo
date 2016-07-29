import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// Install scanner
		Scanner scanner = new Scanner(System.in);

		long reverse = 0;
		int remainder;

		// Need to receive information from the user.
		System.out.println("Looking to have a number inverted? ");
		System.out.print("Please enter a number. ");
		int original = scanner.nextInt();

		// Created loop to invert the numbers user entered.
		while (original != 0) {

			remainder = original % 10;
			reverse = reverse * 10 + remainder;
			original = original / 10;

		}
		
		// print out the inverted number.
		System.out.println("\nThe number you entered is now inverted: " + reverse);
		System.out.println("Thank You.");

		scanner.close();

	}
}
