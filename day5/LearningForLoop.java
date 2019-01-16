package day5;

import java.util.Scanner;

public class LearningForLoop
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int i;
		
		System.out.println("This program will print out your name 10 times");
		System.out.println("Please enter your name: ");
		String name = scanner.nextLine();
		
		for(i=0 ; i<10 ; i++)
		{
			System.out.println(i + ". " + name);
		}
		
		scanner.close();
	}
}
