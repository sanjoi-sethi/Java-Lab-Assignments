//Member Inner Class
class MemberInnerClass
{
	private int data=30;
	
	class Inner
	{
		void msg()
		{
			System.out.println("Data is: "+data);
		}
	}
	
	public static void main(String args[])
	{
		MemberInnerClass obj =new MemberInnerClass();//Object for outer class
		MemberInnerClass.Inner in=obj.new Inner();//Instantiating the object of inner class through outer class object
		in.msg();
	}
}