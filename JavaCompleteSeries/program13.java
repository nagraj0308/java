abstract class program13a
{
int a=10,b=20;
void setdata(int x,int y)
	{

	a=x;
	b=y;


	}
abstract void sum(int x,int y);

}

class program13b extends program13a
{

void sum(int x,int y)
	{

	System.out.println(x+y+a+b);


	}


}

class program13
{
public static void main(String args[])
	{
	program13b o1=new program13b();
        o1.setdata(1,2);
	o1.sum(1,2);
	

	}




}