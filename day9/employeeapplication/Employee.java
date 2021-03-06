package day9.employeeapplication;

public class Employee
{
	int id;
	private String name;
	private int age;
	
	private static int countEmployee = 0;
	
	public Employee(String name, int age)
	{
		this.name = name;
		//this.age = age;
		this.editAge(age);
		countEmployee++;
		this.id = countEmployee;
	}
	
	public void editAge(int age)
	{
		this.age = age;
	}
	
	public int getNumberOfEmployee()
	{
		return countEmployee;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
