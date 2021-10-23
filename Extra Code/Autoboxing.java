//Autoboxing 
import java.util.*;
class Autoboxing
{
	public static void main(String args[])
	{
		int a=20;
		Integer i=Integer.valueOf(a);//int->Integer
		Integer j=a;//Autoboxing
		System.out.println(a+" "+i+" "+j);
	}
}