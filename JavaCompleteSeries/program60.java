import java.io.File;
class program60{
 public static void main(String args[]){
	File x=new File("C:\\Users\\nagendra0308\\Documents\\java\\program60.txt");
	if(x.exists())
		System.out.println(x.getName()+"exist");
	else
		System.out.println(x.getName()+" doesnot exists");
	}
}