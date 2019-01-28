package day8.carapplication;

public class Car
{
	String brand;			//Attributes
	String model;
	String colour;
	int numberOfDoors;
	int currentSpeed = 0;
	
	Wheels wheels;
	
	public void pressAccelerator()
	{
		currentSpeed += 10;
	}
	
	public void pressBrake()
	{
		currentSpeed -= 5;
		if(currentSpeed < 0)
		{
			currentSpeed = 0;
		}
	}
	
	@Override
	public String toString() {
		return "[Brand = " + brand + "\nModel = " + model + "\nColour = " + colour + "\nNumber Of Doors = " + numberOfDoors
				+ "]";
	}
}
