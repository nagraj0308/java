class program14a
{
double x,y;
void setdata(double a,double b)
	{
	x=a;
	y=b;
	}
program14a sum(program14a p1)
	{
	program14a temp=new program14a();
	temp.x=p1.x+x;
	temp.y=p1.y+y;
         return temp;
	}


}



class program14
{
public static void main(String args[])
 	{
        program14a o1=new program14a(),o2=new program14a();
         o1.setdata(5,6.9);
	 o2.setdata(5.3,9);
	

o2=o1.sum(o2);
System.out.println(o2.x);

        }




}