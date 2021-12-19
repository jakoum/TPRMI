import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import tp.rmi.BanqueRMIService;

public class ServeurRMI {
	public static void main(String[]args) throws RemoteException {
	LocateRegistry.createRegistry(1099);
	BanqueRMIService od =new BanqueRMIService();
	try {
		Naming.rebind("rmi://localhost:1099/BK" , od) ;
		System.out.println(od);
	} catch (RemoteException | MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}

}
