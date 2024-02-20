class program39a{
 private int a;
 private int b;
 private int c;

	public program39a(){
	this(1,2,3);
	}

	public program39a(int x){
	this(x,2,3);
	}
	
	public program39a(int x,int y){
	this(x,y,3);
	}

	public program39a(int x,int y,int z){
	setdata(x,y,z);
	}

public void setdata(int x,int y,int z){
	a=x;
	b=y;
	c=z;
	}
public void show(){
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	}
}
class program39{
public static void main(String args[]){
	program39a o=new program39a();
	o.show();
        o=new program39a(5);
	o.show();
	o=new program39a(6,7);
	o.show();
	o=new program39a(8,9,10);
	o.show();
	}
}