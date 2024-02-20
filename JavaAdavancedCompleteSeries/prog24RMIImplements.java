import java.rmi.*;  
import java.rmi.server.*;  
public class  prog24RMIImplements extends UnicastRemoteObject implements  prog24RMIInterface{  
prog24RMIImplements()throws RemoteException{  
super();  
}  
public int add(int x,int y){return x+y;}  
}  