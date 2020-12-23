// Example for PPT page No.7,8,16

public class Truck extends Vehicle
{
	/** Attributes for class Truck */
	private int bedCapacity;
	
	/** Constructor */
	public Truck()
	{
		super();
	}
	
	public Truck(String maker, String model, int tireCount, int bedCapacity)
	{
		super(maker,model,tireCount);
		this.bedCapacity=bedCapacity;
	}
	
	/** Methods for class Car */
	public int getBedCapacity()
	{
		return bedCapacity;
	}
	
	public void setBedCapacity(int bedCapacity)
	{
		this.bedCapacity=bedCapacity;
	}
}