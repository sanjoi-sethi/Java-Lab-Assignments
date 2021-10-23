//Multiple inheritance in interfaces
import java.util.*;
interface Printable
{
	void print();
}

interface Showable
{
	void show();
}

class MultipleInheritance implements Printable, Showable
{
	public void print()
	{
		System.out.println("Hello from Prinatable");
	}
	
	public void show()
	{
		System.out.println("Hello from Showable");
	}
	
	public static void main(String args[])
	{
		Printable obj=new MultipleInheritance();
		obj.print();
		Showable obj1=new MultipleInheritance();
		obj1.show();
	}
}