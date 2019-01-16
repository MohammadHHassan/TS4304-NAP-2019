package day5;

import java.util.Scanner;

/* Implement a Scanner class
 * Prompt the user for an input (integer)
 * Store the input in a variable called 'number'
 * Using a for loop, sum the input 10 times
 * Print out the total
 */

public class Exercise1
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int sum=0;
		
		System.out.println("This program will sum your input 10 times.");
		System.out.println("Please enter an integer: ");
		int number = scanner.nextInt();
		
		for(int i=0 ; i<10 ; i++)
		{
			System.out.println("Loop number " + (i+1) + ": " + number + " + " + sum + " = " + (sum=sum+number));
		}
		
		System.out.println("Sum = " + sum);
		
		scanner.close();
	}
}



