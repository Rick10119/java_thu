// Example for PPT page No.16

public interface Steerable
{
	public static final int LEFT=0;
	public static final int RIGHT=1;
	public static final int U_TURN=2;
	
	public abstract void turnLeft(int degrees);
	public abstract void turnRIGHT(int degrees);
}