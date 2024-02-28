package JavaAdavanced;

import java.rmi.*;

public interface prog24RMIInterface extends Remote {
    public int add(int x, int y) throws RemoteException;
} 