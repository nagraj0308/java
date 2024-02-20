import java.io.*;
import java.lang.*;
import java.util.*;

class program62a{
	private Formatter x;
	
	public void openfile(){
		try{
			x=new Formatter("program62a.txt");
		}catch(Exception e){ System.out.println("U have an error"); }
	}
	public void addrecord(){
		x.format("%s %s %s","3","nagendra","7060196036");
	}
	public void closefile(){
		x.close();
	}

}


class program62{
 public static void main(String args[]){
	program62a o1=new program62a();
	o1.openfile();
	o1.addrecord();
	o1.closefile();

	}
}