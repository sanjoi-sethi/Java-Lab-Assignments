//Garbage Collection using Finalize method
class GarbageCollection
{
	public void finalize()
	{
		System.out.println("Object is garbage collected");
	}
	
	public static void main(String args[])
	{
		GarbageCollection obj=new GarbageCollection();
		obj=null;
		System.gc();
	}
}
