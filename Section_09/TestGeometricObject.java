// Example for PPT page No.22

public class TestGeometricObject
{
	public static void main(String[] args)
	{
		// Declare and create two geometric objects
		GeometricObject geoObject1=new Circle(5);
		GeometricObject geoObject2=new Rectangle(5,3);
	
		System.out.println("The two objects have the same area? "+equalArea(geoObject1,geoObject2));
	
		// Display the circle
		displayGeometricObject(geoObject1);
	
		// Display the rectangle
		displayGeometricObject(geoObject2);
	}
	
	/** Method for compare the areas of two geometric objects */
	public static boolean equalArea(GeometricObject ob1, GeometricObject ob2)
	{
		return ob1.getArea()==ob2.getArea();
	}
	
	/** Method for display a geometric object */
	public static void displayGeometricObject(GeometricObject ob)
	{
		System.out.println();
		System.out.println("The Object is "+ob.toString());
		System.out.println("The area is "+ob.getArea());
		System.out.println("The perimeter is "+ob.getPerimeter());
	}
}