package JavaAdavancedCompleteSeries;

import java.rmi.*;

public class prog24RMIServer {
    public static void main(String args[]) {
        try {
            prog24RMIInterface stub = new prog24RMIImplements();
            Naming.rebind("rmi://localhost:5000/sonoo", stub);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}  