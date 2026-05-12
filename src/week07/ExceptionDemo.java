package week07;

import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		// try and catch
		// menu option [1, 5]
		Scanner sc = new Scanner(System.in);
		boolean hasValidInput = false;
		while(true) {
			try {
				System.out.println("Enter a menu option:");
				String userInput = sc.nextLine();
				int option = Integer.parseInt(userInput);
				hasValidInput = true;
				if(hasValidInput) {
					break;
				}
			} catch (Exception exception) {
				System.out.println("Please enter a valid option.");
			}
		}

//		int a = 10;
//		int b = 0;
//		int div = a / b;

		System.out.println("Hello!");


	}

}
