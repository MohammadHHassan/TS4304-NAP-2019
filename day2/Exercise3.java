package day2;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Exercise 3
 * Implement a Scanner class
 * Prompt the user to enter Name and Age
 * Store the user's inputs in two variables
 * Print out the Name and Age
 * Use try/catch block to prevent an error when a wrong input is given
 */

public class Exercise3
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		String a = scanner.nextLine();
		System.out.println("Your name is " + a);
		
		System.out.println("How old are you? ");
		
		try
		{
			int b = scanner.nextInt();
			System.out.println("Age: " + b);
		}
		catch (InputMismatchException e)
		{
			System.out.println("Wrong Input");
		}
		
		scanner.close();
	}
}
