package day12.shapeapplication;

public class RunProgram
{
	public static void main(String[] args)
	{
		System.out.println("Area of rectangle: ");
		System.out.println("Given length = 5 and breadth = 6");
		Rectangle rectangle1 = new Rectangle("Blue", 5, 6);
		System.out.println("Area of the rectangle = " + rectangle1.getArea());
		
		System.out.println("\nArea of circle:");
		System.out.println("Given radius = 2.5");
		Circle circle1 = new Circle("Red", 2.5);
		System.out.println("Area of the circle = " + circle1.getArea());
		
	}
}
