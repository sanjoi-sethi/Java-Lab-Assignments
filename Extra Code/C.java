import java.util.*;
interface A
{
	void a();
	void b();
	void c();
	void d();
}

abstract class B implements A
{
	public void c()
	{
		System.out.println("I am C");
	}
}

class C extends B
{
	public void a()
	{
		System.out.println("I am A");
	}
	
	public void b()
	{
		System.out.println("I am B");
	}
	
	public void d()
	{
		System.out.println("I am D");
	}
	
	public static void main(String args[])
	{
		C obj=new C();//Can also be: A obj=new C();
		obj.a();
		obj.b();
		obj.c();
		obj.d();
	}
}