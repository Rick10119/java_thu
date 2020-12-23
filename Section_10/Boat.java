// Example for PPT page No.16

public abstract class Boat
{
	private int buoyancy;
	private String mode;
	
	protected Boat()
	{
	}
	
	protected Boat(int buoyancy, String mode)
	{
		this.buoyancy=buoyancy;
		this.mode=mode;
	}
	
	public void sailing()
	{
		System.out.println("We are sailing over the water.");
	}
}