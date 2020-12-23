// Example for PPT page No.27

public class ComparableStudent extends Student implements Comparable
{
	/** Construct a ComparableStudent with specified properties */
	public ComparableStudent(String name, String gender, int age)
	{
		super(name, gender, age);
	}
	
	/** Implement the compareTo method defined in Comparable */
	public int compareTo(Object obj)
	{
		if (getAge() > (((ComparableStudent)obj).getAge()))
		{
			return 1;
		}
		else if (getAge() < (((ComparableStudent)obj).getAge()))
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}