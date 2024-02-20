import java.rmi.*;  
public class prog24RMIClient{  
public static void main(String args[]){  
try{  
prog24RMIInterface stub=(prog24RMIInterface)Naming.lookup("rmi://localhost:5000/sonoo");  
System.out.println(stub.add(34,4));  
}catch(Exception e){}  
}  
}  