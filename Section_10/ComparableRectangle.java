// Example for PPT page No.27

public class ComparableRectangle extends Rectangle implements Comparable
{
	/** Construct a ComparableRectangle with specified properties */
	public ComparableRectangle(double width, double height)
	{
		super(width, height);
	}
	
	/** Implement the compareTo method defined in interface Comparable */
	public int compareTo(Object obj)
	{
		if (getArea()>(((ComparableRectangle)obj).getArea()))
		{
			return 1;
		}
		else if (getArea()<(((ComparableRectangle)obj).getArea()))
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}