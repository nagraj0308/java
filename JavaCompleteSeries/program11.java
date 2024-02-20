class program11a
{
  int x,y;
 void setdata(int a,int b)
	{
	x=a;
	y=b;
	}

}

class program11b extends program11a
{
void printdata()
 {
   System.out.println(x+","+y);
 }

}

class program11
{
public static void main(String args[])
	{
	program11b o1=new program11b();
         o1.setdata(4,6);
	o1.printdata();
	}



}