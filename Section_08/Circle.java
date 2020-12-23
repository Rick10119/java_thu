// Example for PPT page No.13

public class Circle
{
	/** Property for Circle class with private */
	private double radius;
	
	/** Constructors for Circle */
	public Circle()
	{
	}
	
	public Circle(double newRadius)
	{
		this.radius=newRadius;
	}
	
	/** Set a new radius */
	public void setRadius(double newRadius)
	{
		this.radius=newRadius;
	}
	
	/** Get the radius */
	public double getRadius()
	{
		return this.radius;
	}
	
	/** Get area of the circle */
	public double getArea()
	{
		return Math.PI*radius*radius;
	}
}