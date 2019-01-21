package day6;

import java.util.Scanner;

/* Implement a Scanner class
 * Prompt the user to enter the number of students in the class
 * Store the number of students as the size of an array of students' names
 * Prompt the user to enter the name of each student
 * Store each name of the student in the array
 * Print out each name
 * Hint: Use two for loops and make use of <arrayname>.length
 * 		Loop 1: Store the names
 * 		Loop 2: Display the names
 */

public class Exercise1
{
	public static void main(String[] args)
	{
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Please enter the number of students: ");
		int x = scanner1.nextInt();
		
		String [] names = new String[x];
				
		for(int i=0 ; i<names.length ; i++)
		{
			Scanner scanner2 = new Scanner(System.in);
			System.out.println("Please enter the name of student number " + (i+1) + ": ");
			names[i] = scanner2.nextLine();
		}
		
		for(String nama : names)
		{
			System.out.println(nama);
		}
		
	}
}