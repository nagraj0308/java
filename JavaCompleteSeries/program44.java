class program44a{
	private String n1,n2;
	private static int members=0;
	
	 program44a(String a,String b){
		n1=a;
		n2=b;
		members++;
		System.out.printf("constructor for %s %s,members in the club:%d\n",n1,n2,members);
		}
	
	}

class program44{
	public static void main(String args[]){
		program44a o1=new program44a("Nagendra","Chaudhary");
		o1=new program44a("Nagendra","Chaudhary");
		o1=new program44a("Nagendra","Chaudhary");
		o1=new program44a("Nagendra","Chaudhary");
		o1=new program44a("Nagendra","Chaudhary");
	}
}
