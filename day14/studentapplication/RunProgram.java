package day14.studentapplication;

public class RunProgram
{
	public static void main(String[] args)
	{
		Module napModule = new Module("TS4304", "Network Application Programming", 3);
		Student student1 = new Student("Abu", 20);
		Student student2 = new Student("Ahmad", 25);
		Student student3 = new Student("Nabil", 21);
		Student student4 = new Student("Bakar", 17);
		
		System.out.println("Module: " + napModule.getCode() + " " + napModule.getName());
		
		printAddingStudent(napModule, student1);
		printAddingStudent(napModule, student2);
		printAddingStudent(napModule, student3);
		printAddingStudent(napModule, student4);
		printAddingStudent(napModule, student1);
	}
	
	public static void printAddingStudent(Module module, Student student)
	{
		System.out.println("Adding student: " + student.getId() + " " + student.getName());
		System.out.println("Successful? " + module.addStudent(student));
	}
}







