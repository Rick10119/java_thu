// Example for PPT page No.27

public class TestComparable
{
	public static void main(String[] args)
	{
		// Define two Rectangles, and compare them
		ComparableRectangle rec1=new ComparableRectangle(30.2, 20.1);
		Rectangle rec2=new ComparableRectangle(41.3, 14.3);
		
		System.out.println("The area of rec1 is: "+rec1.getArea());
		System.out.println("The area of rec2 is: "+rec2.getArea());
		System.out.println("The result of compare rec1 with rec2 is: "+rec1.compareTo(rec2));
		
		// Define two students, and compare them
		ComparableStudent st1=new ComparableStudent("Jack", "male", 19);
		ComparableStudent st2=new ComparableStudent("Mary", "female", 20);
		
		System.out.println("The age of st1 is: "+st1.getAge());
		System.out.println("The age of st2 is: "+st2.getAge());
		System.out.println("The result of compare st1 with st2 is: "+st1.compareTo(st2));
	}
}