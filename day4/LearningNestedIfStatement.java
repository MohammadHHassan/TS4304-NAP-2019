package day4;

import java.util.Scanner;

public class LearningNestedIfStatement
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your age: ");
		int age = scanner.nextInt();
		
		if(age>0)
		{
			if(age<18)
			{
				System.out.println("Remaja");
			}
			else if(age>=18 && age<35)
			{
				System.out.println("Dewasa");
			}
			else
			{
				System.out.println("Veteran");
			}
		}
		else
		{
			System.out.println("Invalid input");
		}
		
		scanner.close();
	}
}
