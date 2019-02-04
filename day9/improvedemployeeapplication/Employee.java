package day9.improvedemployeeapplication;

import java.time.LocalDate;

public class Employee
{
	int id;
	private String name;
	private int birthYear;
	private static int countEmployee = 0;
	
	public Employee(String name, int birthYear)
	{
		this.name = name;
		this.editBirthYear(birthYear);
		countEmployee++;
		this.id = countEmployee;
	}
	
	public int getAge()
	{
		LocalDate now = LocalDate.now();
		int age = now.getYear() - birthYear;
		return age;
	}
	
	public void editBirthYear(int birthYear)
	{
		LocalDate now = LocalDate.now();
		int minimumBirthYear = now.getYear() - 20;
		int maximumBirthYear = now.getYear() - 60;
		
		if(birthYear<=minimumBirthYear && birthYear>=maximumBirthYear)
		{
			this.birthYear = birthYear;
		}
		else
		{
			birthYear = 0;
		}
	}
	
	public static int getNumberOfEmployee()
	{
		return countEmployee;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", birthYear=" + birthYear + "]";
	}
}









