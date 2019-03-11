package day12.shapeapplication;

public class Triangle extends Shape
{
	double height;
	double base;
	
	public Triangle(String colour, double height, double base)
	{
		super(colour);
		this.height = height;
		this.base = base;
	}
	
	public double getArea()
	{
		return 0.5*base*height;
	}
	
	public double getPerimeter()
	{
		double a = Math.sqrt((base*base)+(height*height));
		return base+height+a;
	}
}
