package day3;

import java.util.Scanner;

/* Create a random number generator
 * in which maximum and minimum number
 * can be chosen by the user.
 * Print out the number generated.
 */

public class Exercise1
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the maximum number: ");
		int max = scanner.nextInt();
		
		System.out.println("Please enter the minimum number: ");
		int min = scanner.nextInt();
		
		int number = min + (int)(Math.random()*(max-min)+1);
		System.out.println("Number generated = " + number);
		
		scanner.close();
	}
}
