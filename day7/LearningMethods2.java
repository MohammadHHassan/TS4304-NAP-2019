package day7;

public class LearningMethods2
{
	public static void main(String[] args)
	{
		System.out.println("Sum from 1-5: " + sumRangeValue(1,5));
		System.out.println("Sum from 10-15: " + sumRangeValue(10,15));
		System.out.println("Sum from 20-25: " + sumRangeValue(20,25));
	}
	
	public static int sumRangeValue(int min, int max)
	{
		int sum=0;
		
		for(int i=min ; i<=max ; i++)
		{
			sum = sum+i;
		}
		
		return sum;
	}
}
