// Example for PPT page No.12

public class TestTV
{
	public static void main(String[] args)
	{
		// Create object tv1 in TV class
		TV tv1=new TV();
		tv1.turnOn();
		tv1.setChannel(25);
		tv1.setVolumeLevel(3);
		
		// Create new object tv2 in TV class
		TV tv2=new TV();
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.channelUp();

		// Display the current status for tv1 and tv2
		System.out.println("TV1's channel is "+tv1.channel+" volume level is "+tv1.volumeLevel);
		System.out.println("TV2's channel is "+tv2.channel+" volume level is "+tv2.volumeLevel);
	}
}