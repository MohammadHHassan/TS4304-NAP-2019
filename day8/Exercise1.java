package day8;

import java.time.LocalDate;
import java.util.Scanner;

/* Implement a LocalDate & Scanner class
 * Store the integer year in a variable (Optional)
 * Prompt the user to enter their year of birth
 * Calculate the user's age
 * Print out the user's age
 */

public class Exercise1
{
	public static void main(String[] args)
	{
		LocalDate now = LocalDate.now();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your birth year: ");
		int birthYear = scanner.nextInt();
		
		System.out.println("Your age is " + (now.getYear()-birthYear));
	}
}
