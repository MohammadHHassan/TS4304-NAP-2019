package day10.computerapplication;

public class Computer
{
	String operatingSystem;
	boolean powerState;
	
	public Computer(String operatingSystem)
	{
		this.operatingSystem = operatingSystem;
		//this.powerState = false;
		shutDown();
	}
	
	public void bootUp()
	{
		powerState = true;
	}
	
	public void shutDown()
	{
		powerState = false;
	}
}



