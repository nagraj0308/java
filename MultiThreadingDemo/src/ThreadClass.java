
public class ThreadClass {

	public static void main(String[] args) {
		int n = 8; // Number of threads 
		for (int i=0; i<8; i++) 
		{ 
			ThreadClass1 object1 = new ThreadClass1(); 
			object1.start(); 
			Thread object2 = new Thread(new ThreadRunnable()); 
			object2.start(); 
		} 

	}

}
