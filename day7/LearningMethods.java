package day7;

public class LearningMethods
{
	public static void main(String[] args)
	{
		int sum1 = 0;
		
		for(int i=1 ; i<=5 ; i++)
		{
			System.out.println("Sum = " + sum1);
			sum1 = sum1 + i;
		}
		System.out.println("Final sum = " + sum1);
		
		int sum2 = 0;
		
		for(int j=10 ; j<=15 ; j++)
		{
			System.out.println("Sum 2 = " + sum2);
			sum2 = sum2 + j;
		}
		System.out.println("Final sum 2 = " + sum2);
		
		int sum3 = 0;
		
		for(int j=20 ; j<=25 ; j++)
		{
			System.out.println("Sum 3 = " + sum3);
			sum3 = sum3 + j;
		}
		System.out.println("Final sum 3 = " + sum3);
	}
}


