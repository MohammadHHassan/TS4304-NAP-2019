package day6;

import java.util.Scanner;

public class LearningArrays2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String [] months = {"January", "February", "March", "April",
							"May", "June", "July", "August", "September",
							"October", "November", "December"};
		
		System.out.println("Please enter your month of birth [1-12]: ");
		int birthMonth = scanner.nextInt();
		
		if(birthMonth>=1 && birthMonth<=12)
		{
			System.out.println("Your birth month is " + months[birthMonth-1]);
		}
		else
		{
			System.out.println("Invalid input.");
		}
	}
}
