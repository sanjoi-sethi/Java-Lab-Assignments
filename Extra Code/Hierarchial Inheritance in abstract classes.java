//Hierarchial Inheritance in abstract classes
import java.util.*;
abstract class Shape
{
	Shape()
	{
		System.out.println("Hi!");
	}
	
	abstract void draw();
}

class Circle extends Shape
{
	void draw()
	{
		System.out.println("Circle");
	}
}

class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Rectangle");
	}
	
	public static void main(String args[])
	{
		Shape obj=new Circle();
		obj.draw();
		Shape obj1=new Rectangle();
		obj1.draw();
	}
}

