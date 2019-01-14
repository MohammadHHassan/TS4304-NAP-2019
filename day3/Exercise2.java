package day3;

import java.util.Scanner;

/* Modify LearningIfStatement.java
 * so that a and b is stored using Scanner (User's input)
 * 
 * If a>b, Print out "a is greater than b"
 * If a=b, Print out "a equals b"
 * If a<b, Print out "a less than b"
 */

public class Exercise2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the value of a: ");
		int a = scanner.nextInt();
		
		System.out.println("Enter the value of b: ");
		int b = scanner.nextInt();
		
		if(a>b)
		{
			System.out.println("a is greater than b");
		}
		else if(a==b)
		{
			System.out.println("a equals b");
		}
		else
		{
			System.out.println("a less than b");
		}
		
		scanner.close();
	}
}
