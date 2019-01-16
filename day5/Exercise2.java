package day5;

/* Copy and paste the code in LearningNestedForLoop.java
 * This time, sum i and j and display it on the table
 * Additionally, sum up the total for all the values in
 * the table and print out your final answer.
 */

public class Exercise2
{
	public static void main(String[] args)
	{
		int i, j, sum1, sum2=0;
		
		for(i=0 ; i<5 ; i++)
		{
			sum1 = 0;
			
			for(j=0 ; j<5 ; j++)
			{
				System.out.print(i + j + "\t");
				sum1 = sum1 + i + j;
			}
			System.out.println("\tTotal for row " + i + " is = " + sum1);
			System.out.println();
			sum2 = sum2+sum1;
		}
		
		System.out.println("Total = " + sum2);
	}
}


