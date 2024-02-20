class program46a{
	private int sum;
	private final int num;
	
	 program46a(int x){
		num=x;
		
		}
	 void add(){
		sum+=num; 
		}
	public String toString(){
		return String.format("sum=%d\n",sum);
		}
	
	}

class program46{
	public static void main(String args[]){
	program46a o1=new program46a(10);
	for(int i=0;i<5;i++){ o1.add();
		System.out.printf("%s",o1);
		}
		
	}
}
