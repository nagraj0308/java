class program10a
{
double x,y;
void setdata(double a,double b)
	{
	x=a;
	y=b;
	}
program10a sum(program10a p1,program10a p2)
	{
	program10a temp=new program10a();
	temp.x=p1.x+p2.x;
	temp.y=p1.y+p2.y;
         return temp;
	}


}



class program10
{
public static void main(String args[])
 	{
        program10a o1=new program10a(),o2=new program10a();
         o1.setdata(5,6.9);
	 o2.setdata(5.3,9);
	o1.sum(o1,o2);
System.out.println(o2.x);

o2=o1.sum(o1,o2);
System.out.println(o2.x);

        }




}