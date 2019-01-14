package day3;

public class LearningArithmetic
{
	public static void main(String[] args)
	{
		int a=9, b=4;
		int c = a/b;
		System.out.println("c = " + c);
		
		double d=9, e=4;
		double f = d/e;
		System.out.println("f = " + f);
		
		double g=4, h=3;
		double i = Math.pow(g, h);
		System.out.println("i = " + i);
		
		System.out.println("4 to the power of 3 = " + Math.pow(4, 3));
		
		double j=16;
		double k = Math.sqrt(j);
		System.out.println("k = " + k);
		
		System.out.println("Square root of 16 = " + Math.sqrt(16));
		
		int l=9, m=4;
		int n = l%m;
		System.out.println("n = " + n);
		
		double o = 7.999;
		System.out.println("o = " + o);
		int p = (int) o;
		System.out.println("p = " + p);
		
		int q = 8;
		System.out.println("q = " + q);
		double r = (double) q;
		System.out.println("r = " + r);
	}
}


