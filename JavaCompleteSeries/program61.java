import java.util.*;
class program61{
 public static void main(String args[]){
	final Formatter x;
	try{
		x=new Formatter("program61.txt");
		System.out.println("You created a file");
	   }catch(Exception e){  System.out.println("You got an error");  }
	
	}
}