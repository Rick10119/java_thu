// Example for PPT page No.12

public class TV
{
	/** Properties for TV with default value */
	int channel=1; 		// Default channel is 1, (1-100)
	int volumeLevel=1; 	// Default volume level is 1, (1-7)
	boolean on=false; 	// By default TV is off
	
	/** Constructor for TV */
	public TV()
	{
	}
	
	/** Methods for operate TV */
	public void turnOn()
	{
		on=true;
	}
	
	public void turnOff()
	{
		on=false;
	}
	
	public void setChannel(int newChannel)
	{
		if(on && newChannel>=1 && newChannel<=100)
		{
			channel=newChannel;
		}
	}
	
	public void setVolumeLevel(int newVolumeLevel)
	{
		if(on && newVolumeLevel>=1 && newVolumeLevel<=7)
		{
			volumeLevel=newVolumeLevel;
		}
	}
	
	public void channelUp()
	{
		if (on && channel<100)
		{
			channel++;
		}
	}
	
	public void channelDown()
	{
		if (on && channel>1)
		{
			channel--;
		}
	}
	
	public void volumeUp()
	{
		if (on && volumeLevel<7)
		{
			volumeLevel++;
		}
	}
	
	public void volumeDown()
	{
		if (on && volumeLevel>1)
		{
			volumeLevel--;
		}
	}
}