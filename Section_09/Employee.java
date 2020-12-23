// Example for PPT page No.24

public class Employee extends Person
{
	/** Constructor with default super() */
	public Employee()
	{
		this("(2)Invoke Employee's overload constructor");
		System.out.println("(3)Employee's no-arg constructor is invoked");
	}
	
	/** Constructor with parameter */
	public Employee(String s)
	{
		super();
		System.out.println(s);
	}
}