package day4;

import java.util.Scanner;

/* Implement a Scanner class
 * Prompt the user to enter the value 5 (integer)
 * 
 * If the user entered the wrong number,
 * keep on prompting the user for input until
 * a number 5 is entered.
 * 
 * Additionally, count the number of times the
 * user entered the wrong number.
 */

public class Exercise2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int count=1, input=0;
		
		while(input!=5)
		{
			System.out.println("Cubaan yang ke-" + count);
			System.out.println("Sila tekan nombor 5: ");
			input = scanner.nextInt();
			count++;
			System.out.println("====================");
		}
		
		System.out.println("Wrong input counter: " + (count-2));
		System.out.println("Yay balik");
	}
	
}




