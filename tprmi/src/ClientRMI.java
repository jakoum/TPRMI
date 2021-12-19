import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

import tp.metier.Compte;
import tp.rmi.IBanqueRemote;








public class ClientRMI {
	
		public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
			IBanqueRemote isub=(IBanqueRemote)
			Naming.lookup("rmi://localhost:1099/BK") ;
			
			System.out.println(isub.conversion(10));
			System.out.println("consultation d'un compte à distance");
		    Compte cp=isub.consulterCompte(1);
			System.out.println("le code du compte est:"+cp.getCode());
			System.out.println("le solde du compte est:"+cp.getsolde());
			System.out.println("la date de creation du compte est"+cp.getdatecreation());
			List<Compte> cptes=isub.listComptes();
			for(Compte c:cptes) {
				System.out.println("compte numero:"+c.getCode());
				System.out.println("le solde"+c.getsolde());
				System.out.println("la date de creation"+c.getdatecreation());
			}
			
			
		}
	
}
