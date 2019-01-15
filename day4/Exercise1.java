package day4;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Implement a Scanner class
 * Prompt the user to enter their marks
 * If marks>=50, Pass
 * Else, Fail
 * 
 * Additionally, if marks>=90, Distinction
 * 					marks>=80 & marks<90, Merit
 * 					marks>=50 & marks<80, Just Pass
 */

public class Exercise1
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your marks: ");
		
		try
		{
			double marks = scanner.nextDouble();
			
			if(marks>=50 && marks<=100)
			{
				System.out.println("Pass");
				
				if(marks>=90)
				{
					System.out.println("Distinction");
				}
				else if(marks>=80 && marks<90)
				{
					System.out.println("Merit");
				}
				else
				{
					System.out.println("Just Pass");
				}
			}
			else if(marks<50 && marks>=0)
			{
				System.out.println("Fail");
			}
			else
			{
				System.out.println("Invalid Input");
			}
		}
		catch (InputMismatchException e)
		{
			System.out.println("Only numbers are allowed");
		}
		
		scanner.close();
	}
}