package day8.carapplication;

public class RunProgram
{
	public static void main(String[] args)
	{
		Wheels wheels1 = new Wheels();
		wheels1.brand = "LingLong";
		wheels1.size = 17;
		
		Wheels wheels2 = new Wheels();
		wheels2.brand = "Bridgestone";
		wheels2.size = 20;
		
		Car car1 = new Car();
		car1.brand = "Toyota";
		car1.model = "Super Kijang";
		car1.colour = "Red";
		car1.numberOfDoors = 2;
		car1.wheels = wheels2;
		
		System.out.println("Car 1: ");
		System.out.println(car1);
		System.out.println("Car 1 wheels = " + car1.wheels);
		System.out.println();
		
		/*
		System.out.println("Current speed = " + car1.currentSpeed);
		car1.pressAccelerator();
		System.out.println("New speed = " + car1.currentSpeed);
		car1.pressBrake();
		System.out.println("Speed after braking = " + car1.currentSpeed);
		car1.pressAccelerator();
		car1.pressAccelerator();
		car1.pressAccelerator();
		car1.pressAccelerator();
		car1.pressAccelerator();
		System.out.println("Speed after accelerating 5 times = " + car1.currentSpeed);
		*/
		
		Car car2 = new Car();
		car2.brand = "BMW";
		car2.model = "M2";
		car2.colour = "White";
		car2.numberOfDoors = 3;
		car2.wheels = wheels1;
		
		//printText(car2);
		System.out.println("Car 2: ");
		System.out.println(car2);
		System.out.println("Car 2 wheels = " + car2.wheels);
		System.out.println();
	}
	
	public static void printText(Car car)
	{
		System.out.println("Brand = " + car.brand);
		System.out.println("Model = " + car.model);
		System.out.println("Colour = " + car.colour);
		System.out.println("Number of doors = " + car.numberOfDoors);
		System.out.println("=============================");
	}
}
