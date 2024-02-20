class program40a{
 private int a;
 private int b;
 private int c;
	public program40a(int x,int y,int z){
	a=x;
	b=y;
	c=z;
	System.out.printf("The constructor for this is %s \n", this);
	}
	public String toString(){    //toString is inbuilt method ,used to convert a obj. into string
	return String.format("%d/%d/%d",a,b,c);	
	}
	public void show(){
	System.out.println("The constructor");
	}
}
 


class program40{
public static void main(String args[]){
	program40a o=new program40a(2,3,4);
	}
}