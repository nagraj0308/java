class program36{
  public static void main(String args[]){
	System.out.println(avarage(4,5,6,7,8,9,0,2,3,4,5,6,7));
	}
public static int avarage(int...numbers) //variable length argument
	{
	int total=0;
	for(int x:numbers)
	total+=x;
	return total/numbers.length;
	}
}
	