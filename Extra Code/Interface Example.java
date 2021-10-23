//Interface Implementation
import java.util.*;
interface Printable
{
	void print();
}

class Printing implements Printable
{
	public void print()
	{
		System.out.println("Hello World");
	}
	
	public static void main(String args[])
	{
		Printing obj=new Printing();
		obj.print();
		Printable obj1=new Printing();
		obj1.print();
	}
}