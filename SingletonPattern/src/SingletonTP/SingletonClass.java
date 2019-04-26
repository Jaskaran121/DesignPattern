package SingletonTP;

public class SingletonClass {

	private static SingletonClass object;
	private SingletonClass()
	{
		
	}
	//Broken in multithreaded programs
	public static SingletonClass getInstance()
	{
		if(object==null)
		{
			object = new SingletonClass();
		}
		return object;
	}
	
	public void perfomFunction()
	{
		System.out.print("Performing function for SingletonCLass");
	}
	
}
