interface I1
{
public void work1(); //public is optional
}
interface I2
{
void work2();
}
interface I3 extends I1, I2
{
public void show(); //public is optional
public void display(); //public is optional
public void output(); //public is optional
}
class C1 implements I3
{
public void show()
{ 
System.out.println("We are in Show of complete1");
}
public void display()
{
System.out.println("We are in Display of complete1");
}
public void output()
{
System.out.println("We are in Output of complete1");
}
public void work1()
{
System.out.println("We are in work1 of complete1");
}
public void work2()
{
System.out.println("We are in work2 of complete1");
}

}

class C2 implements I3
{
public void show()
{
System.out.println("We are in show of complete2");
}
public void display()
{
System.out.println("We are in display of complete2");
}
public void output()
{
System.out.println("We are in output of complete2");
}
public void work1()
{
System.out.println("We are in work1 of complete2");
}
public void work2()
{
System.out.println("We are in work2 of complete2");
}

}

class program19
{
public static void main(String args[])
{
C1 o1 = new C1();
C2 o2 = new C2();
o1.show();
o1.display();
o1.output();
o1.work1();
o1.work2();
o2.show();
o2.display();
o2.output();
}
}