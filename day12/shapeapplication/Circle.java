package day12.shapeapplication;

public class Circle extends Shape
{
	double radius;
	
	public Circle(String colour, double radius)
	{
		super(colour);
		this.radius = radius;
	}
	
	public double getArea()
	{
		return Math.PI*radius*radius;
	}
	
	public double getPerimeter()
	{
		return 2*Math.PI*radius;
	}
}
