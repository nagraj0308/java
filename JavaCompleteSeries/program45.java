class program45a{
	private String n1,n2;
	private static int members=0;
	
	 program45a(String a,String b){
		n1=a;
		n2=b;
		members++;
		System.out.printf("constructor for %s %s,members in the club:%d\n",n1,n2,members);
		}
	String getn1(){ return n1 ;}
	String getn2(){ return n2 ;}
	static int getmem(){ return members; }
	
	}

class program45{
	public static void main(String args[]){
		program45a o1=new program45a("Nagendra","Chaudhary");
		o1=new program45a("Nagendra","Chaudhary");
		o1=new program45a("Nagendra","Chaudhary");
		o1=new program45a("Nagendra","Chaudhary");
		o1=new program45a("Nagendra","Chaudhary");
		System.out.println(o1.getn1()+o1.getn2()+o1.getmem());
	}
}
