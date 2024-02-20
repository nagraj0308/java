import java.rmi.*;
import java.rmi.server.*;   

public interface prog24RMIInterface extends Remote{  
public int add(int x,int y)throws RemoteException;  
} 