//Final Method Eg
class Bike
{
	final void run()
	{
		System.out.println("running");
	}  
}

class FinalMethod extends Bike
{
	/*void run()
	{
	   System.out.println("running safely with 100kmph");
	} Gives CT error*/ 
	
    public static void main(String args[])
	{  
	   FinalMethod obj= new FinalMethod();  
	   obj.run();  
	}  
}  