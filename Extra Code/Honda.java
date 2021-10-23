//Abstract Class
import java.util.*;
abstract class Bike
{
	abstract void run();//Declaration
}

class Honda extends Bike
{
	void run()
	{
		System.out.println("Running Safely");//Definition
	}
	
	public static void main(String args[])
	{
		Honda obj=new Honda();//Object of Honda class
		obj.run();
		Bike obj1=new Honda();//Object of Bike class but refers object of Honda class
		obj1.run();
	}
}