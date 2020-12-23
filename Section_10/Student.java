// Example for PPT page No.27

public class Student
{
	String name;
	String gender;
	int age;
	
	/** Constructor with properties */
	public Student(String name, String gender, int age)
	{
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
	
	/** only useful method here */
	public int getAge()
	{
		return age;
	}
}