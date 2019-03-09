package revision;

import java.util.Scanner;

public class Revision2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name = scanner.nextLine();
		
		while(true)
		{
			System.out.println("Please enter the password: ");
			String password = scanner.nextLine();
			
			if(password.equals("abc123"))
			{
				System.out.println("Welcome " + name);
				break;
			}
			else
			{
				System.out.println("Invalid password.");
				System.out.println("Please try again.");
			}
		}
	}
}
