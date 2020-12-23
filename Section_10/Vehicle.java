// Example for PPT page No.7,8,16

public abstract class Vehicle
{
	/** Attributes for the Vehicle class */
	private String maker;
	private String model;
	private int tireCount;
	
	/** Constructor for the abstract class */
	protected Vehicle()
	{
	}
	
	protected Vehicle(String maker, String model, int tireCount)
	{
		this.maker=maker;
		this.model=model;
		this.tireCount=tireCount;
	}
	
	/** Methods for get and set the attributes */
	public String getMaker()
	{
		return maker;
	}
	
	public void setMaker(String maker)
	{
		this.maker=maker;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public void setModel(String model)
	{
		this.model=model;
	}

	public int getTireCount()
	{
		return tireCount;
	}
	
	public void setTireCount(int tireCount)
	{
		this.tireCount=tireCount;
	}

	public String toString()
	{
		return "It is made by: "+maker+", has "+tireCount+" tires, and model is "+model;
	}
}