package day6;

public class LearningArrays
{
	public static void main(String[] args)
	{
		int [] number = new int[6];
		number[0] = 10;
		number[1] = 20;
		number[2] = 30;
		number[3] = 40;
		number[4] = 50;
		number[5] = 60;
		
		for(int i=0 ; i<number.length ; i++)
		{
			System.out.print(number[i] + "\t");
		}
		System.out.println();
		
		for(int j : number)
		{
			System.out.print(j + "\t");
		}
		System.out.println();
		
		String [] names = new String[4];
		names[0] = "Abu";
		names[1] = "Bakar";
		names[2] = "Curi";
		names[3] = "Daging";
		
		for(String nama : names)
		{
			System.out.print(nama + " ");
		}
	}
}
