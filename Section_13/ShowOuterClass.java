// Example for PPT Page No.18

public class ShowOuterClass
{
	private int data;

	/** A method in the outer class */
	public void m() 
	{
		// Do something
		OuterClass instance = new OuterClass();
	}

}

// An class in same file
class OuterClass 
{
	/** A method in the same level class */
	public void mi() 
	{
//		data++;
//		m();
	}
}