//Final Variable Eg
class FinalVariable
{
	final int speedlimit=90;//final variable  
	void run()
	{
		//speedlimit=400;  Gives CT error
		System.out.println(speedlimit);
	}  
	
	public static void main(String args[])
	{
		FinalVariable obj=new  FinalVariable();  
		obj.run();  
	}  
}