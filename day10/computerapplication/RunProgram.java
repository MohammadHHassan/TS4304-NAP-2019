package day10.computerapplication;

public class RunProgram
{
	public static void main(String[] args)
	{
		Smartphone smartphone1 = new Smartphone("iOS");
		smartphone1.chargeBattery(80);
		System.out.println(smartphone1.getBatteryCapacity());
		smartphone1.useBattery();
		System.out.println(smartphone1.getBatteryCapacity());
		
		Desktop desktop1 = new Desktop("Windows 10");
		desktop1.bootUp();
		System.out.println(desktop1.powerState);
	}
}
