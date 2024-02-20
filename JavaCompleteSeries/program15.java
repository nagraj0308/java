class program15a
{

	program15a(int e)
	{
	System.out.println(e);
	}


}


class program15b extends program15a
{

	program15b(int c,int d,int e)
	{
	super(e);
 	System.out.println(d);
	System.out.println(c);
	
	}


}

class program15c extends program15b
{

	program15c(int a,int b,int c,int d,int e)
	{
	super(c,d,e);
	System.out.println(b);
	System.out.println(a);
	}


}


class program15
{
public static void main(String args[])
	{
	program15c o1=new program15c(1,2,3,4,5);
	}


}