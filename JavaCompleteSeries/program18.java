class program18a extends Thread
{
	program18a()
	{
	start();
	}
	public void run()
	{
		try
		{
			int a=1;
			while(a<10){
			System.out.println("A");
			Thread.sleep(1000);
			a++; }		
		}
		
		catch(Exception k)
		{
		System.out.println(k);
		}

	}
	


}
class program18b extends Thread
{
	program18b()
	{
	start();
	}

	public void run()
	{
		try
		{
			int a=1;
			while(a<10){
			System.out.println("B");
			Thread.sleep(1000);
			a++; }		
		}	
		catch(Exception k)
		{
			System.out.println(k);
		}
	}
}



class program18 
{
public static void main(String args[])
	{
	program18a o1=new program18a();	
	program18b o2=new program18b();	
	}



}