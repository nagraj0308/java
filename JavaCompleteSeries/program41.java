class program41a{
	private int a;
	private int b;
	private int c;

	public program41a(int x,int y,int z){
		a=x;
		b=y;
		c=z;
		System.out.printf("The constructor for this %s\n",this);
		}

	public String toString(){
		return String.format("%d/%d/%d",a,b,c);
		}
}

class program41b{
	private String name;
	private program41a date;
	public program41b(String x,program41a y){
		name=x;
		date=y;
	}
	
	public String toString(){
	return String.format("My name is %s my birthday is %s",name,date);
	}
}

class program41{
public static void main(String args[]){
	program41a o1=new program41a(5,7,96);
	program41b o2=new program41b("NC",o1);
	}
}


