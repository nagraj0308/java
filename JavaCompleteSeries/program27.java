import java.util.*;
class program27
{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
        System.out.println("Enter First Number");
	int a;
	
	      do{
		 a=s.nextInt();
		switch(a){
		case 1:
		System.out.println("e"); break;
		case 2:
		System.out.println("s"); break;
		default:
		System.out.println("t");
	
		}
		}while(a!=0);
	
	}
	
}