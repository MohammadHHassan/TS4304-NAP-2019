package day13.shape2d3dapp;

public class Rectangle extends Shape implements Shape2D
{
	double length, breadth;
	
	public Rectangle(String colour, double length, double breadth)
	{
		super(colour);
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double getArea()
	{
		return length*breadth;
	}
	
	@Override
	public double getPerimeter()
	{
		return (2*length)+(2*breadth);
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + ", colour=" + colour + "]";
	}
}
