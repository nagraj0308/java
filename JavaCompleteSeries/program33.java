class program33{
 public static void main(String args[]){
	
	int freq[]=new int[6];
	for(int i=0;i<6;i++)
	freq[i]=2*i;


	for(int x: freq)//Enhanced for loop
	System.out.println(x);
	}
}