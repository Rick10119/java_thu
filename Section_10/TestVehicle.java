// Example for PPT page No.8

public class TestVehicle
{
	public static void main(String[] args)
	{
		Vehicle[] v=new Vehicle[10];
		
		addVehicle(v);
		displayVehicle(v);
	}
	
	public static void addVehicle(Vehicle[] v1)
	{
		v1[0]=new Car("比亚迪","G6",4,465);
		v1[1]=new Car("上海通用别克","凯越",4,405);
		v1[2]=new Car("上海大众","途观",4,400);
		v1[3]=new Truck("一汽解放","J6L",6,5472);
		v1[4]=new Truck("东风","天锦",6,9315);
		v1[5]=new Truck("奔驰","Actros",10,10000);
		v1[6]=new Car("一汽大众","捷达",4,466);
		v1[7]=new Car("奔驰","GLS",4,590);
		v1[8]=new Car("宝马","Z4",4,180);
		v1[9]=new Truck("Volvo","FMX",12,20640);
	}
	
	public static void displayVehicle(Vehicle[] v2)
	{
		for(int i=0;i<v2.length;i++)
		{
			System.out.print("The vehicle no."+i+" is a ");
			
			if (v2[i] instanceof Car)
			{
				System.out.println("Car:");
				System.out.println(v2[i].toString()+",");
				System.out.println("and its trunk capacity is "+((Car)v2[i]).getTrunkCapacity()+".");
			}
			else
			{
				System.out.println("Truck:");
				System.out.println(v2[i].toString()+",");
				System.out.println("and its bed capacity is "+((Truck)v2[i]).getBedCapacity()+".");
			}
			
			System.out.println();
		}
	}
}