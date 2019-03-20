package day3;

public class LearningRandomNumber
{
	public static void main(String[] args)
	{
		int a = 1 + (int)(Math.random()*(10-1)+1);
		// int randomNumber = min + (int)(Math.random()*((max-min)+1))
		System.out.println("Number generated = " + a);
	}
}
