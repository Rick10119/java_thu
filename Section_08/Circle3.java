// Example for PPT page No.26

public class Circle3
{
	/** The radius of this circle (default: 1.0) */
	private double radius=1.0;
	
	/** The number of circle objects created */
	private static int numberOfObjects=0;
	
	/** Constructs a default circle object */
	public Circle3()
	{
		numberOfObjects++;
	}
	
	/** Constructs a circle object with the specified radius */
	public Circle3(double newRadius)
	{
		radius=newRadius;
		numberOfObjects++;
	}
	
	/** ---- Other methods for Circle ----*/
	/** Return the radius of this circle */
	public double getRadius()
	{
		return radius;
	}
	
	/** Sets a new radius for this circle */
	public void setRadius(double newRadius)
	{
		radius=(newRadius>=0)?newRadius:0;
	}
	
	/** Returns the number of circle objects created */
	public static int getNumberOfObjects()
	{
		return numberOfObjects;
	}
	
	/** Returns the area of this circle */
	public double getArea()
	{
		return radius*radius*Math.PI;
	}
}