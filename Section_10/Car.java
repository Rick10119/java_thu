// Example for PPT page No.7,8,16

public class Car extends Vehicle
{
	/** Attributes for class Car */
	private int trunkCapacity;
	
	/** Constructor */
	public Car()
	{
		super();
	}
	
	public Car(String maker, String model, int tireCount, int trunkCapacity)
	{
		super(maker,model,tireCount);
		this.trunkCapacity=trunkCapacity;
	}
	
	/** Methods for class Car */
	public int getTrunkCapacity()
	{
		return trunkCapacity;
	}
	
	public void setTrunkCapacity(int trunkCapacity)
	{
		this.trunkCapacity=trunkCapacity;
	}
}