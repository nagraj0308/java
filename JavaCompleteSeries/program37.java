class program37{
  public static void main(String args[]){
	str(4,5,6);
	}
public static void str(int...num)
	{
	
	System.out.println(String.format("%02d:%02d:%02d",num[0],num[1],num[2]));
	System.out.println(String.format("%d:%02d:%s",num[0],num[1],num[2]));
	//System.out.println(String.format("%02d:%02d:%02d",num[0],num[1],num[2]));
	//System.out.println(String.format("%02d:%02d:%02d",num[0],num[1],num[2]));
	}
}
	