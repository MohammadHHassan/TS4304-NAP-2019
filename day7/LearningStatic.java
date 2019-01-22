package day7;

public class LearningStatic
{
	static int y = 10;
	
	public static void main(String[] args)
	{
		int x=5;
		
		System.out.println("1. Old y = " + y);
		System.out.println("2. New y = " + incrementYBy20());
		System.out.println("3. New y = " + incrementYBy20());
		System.out.println("4. Old y = " + y);
		
		System.out.println("5. New x = " + incrementBy10(x));
		System.out.println("6. Old x = " + x);
	}
	
	public static int incrementYBy20()
	{
		return y = y+20;
	}
	
	public static int incrementBy10(int value)
	{
		return value = value+10;
	}
}
