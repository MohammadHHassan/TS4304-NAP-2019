package day9.improvedemployeeapplication;

public class RunProgram
{
	public static void main(String[] args)
	{
		Employee employee1 = new Employee("Mohammad", 1995);
		System.out.println(employee1);
		
		Employee employee2 = new Employee("Hj Hassan", 1949);
		System.out.println(employee2);
		
		System.out.println("Employee 1's age is " + employee1.getAge());
		
		employee2.editBirthYear(1970);
		System.out.println(employee2);
		System.out.println("Employee 2's age is " + employee2.getAge());
	}
}
