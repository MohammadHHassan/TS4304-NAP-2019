package day2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LearningScanner
{
	public static void main(String[] args)
	{
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your first name: ");
		String a = scanner.nextLine();
		
		System.out.println("Please enter your last name: ");
		String b = scanner.nextLine();
		
		System.out.println("Your name is "+ a + " " + b);
		
		System.out.println("Please enter an integer value: ");
		int c = scanner.nextInt();
		System.out.println("User input = " + c);
		
		System.out.println("Please enter a double value: ");
		double d = scanner.nextDouble();
		System.out.println("User input = " + d);
		
		System.out.println("Enter ONLY integer value: ");
		
		try
		{
			int e = scanner.nextInt();
			System.out.println("User input = " + e);
		}
		catch (InputMismatchException e)
		{
			System.out.println("Wrong Input");
		}
		
		scanner.close();
	}
}




