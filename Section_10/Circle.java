// Example for PPT page No.11

public class Circle extends GeometricObject
{
	private double radius;
	
	public Circle()
	{
	}
	
	public Circle(double radius)
	{
		super();
		this.radius=radius;
	}
	
	public Circle(double radius, String color, boolean filled)
	{
		super(color,filled);
		this.radius=radius;
	}
	
	/** Return radius */
	public double getRadius()
	{
		return radius;
	}
	
	/** Set a new radius */
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	
	/** Return area */
	public double getArea()
	{
		return radius*radius*Math.PI;
	}
	
	/** Return diameter */
	public double getDiameter()
	{
		return 2*radius;
	}
	
	/** Return perimeter  */
	public double getPerimeter()
	{
		return 2*radius*Math.PI;
	}
	
	/** Print the circle info */
	public void prinCircle()
	{
		System.out.println(toString()+"The circle is created "+getDateCreated()+" and the radius is "+radius);
	}
	
	/** Override toString method */
	public String toString()
	{
		return "Circle with "+getColor()+" "+super.toString();
	}
}