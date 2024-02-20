import java.util.Random;
class program31
{
public static void main(String args[]){
	Random a=new Random();
	
	for(int counter=1;counter<10; counter++){
	int b=1+a.nextInt(100);
	System.out.println(b);
	}
}
}