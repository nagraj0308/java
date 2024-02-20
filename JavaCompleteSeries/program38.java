class program38a
{
	private int x=10;
	private int y=20;

 void setdata1(int x,int y)
	{
	x=x;
	y=y;
	}
void setdata2(int x,int y)
	{
	this.x=x;
	this.y=y;
	}
void display()
	{
	System.out.println(x);
	System.out.println(y);
	
	}
	
}



class program38
{
public static void main(String args[])
 	{
        program38a o1=new program38a();
	
	//System.out.println(o1.x);
         o1.setdata1(5,6);
	o1.display();
	 o1.setdata2(5,9);
	o1.display();



        }




}