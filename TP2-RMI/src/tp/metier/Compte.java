package tp.metier;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Compte implements Serializable {
	int code; 
	double solde; 
	Date dateCreation;
	
	public Compte(int code,double solde,java.util.Date date){
		this.code=code;
		this.solde=solde;
		this.dateCreation=(Date) date;
		
	}
	public int getCode() {
		return code;
	}
	public double getsolde() {
		return solde;
	}
	public Date getdatecreation() {
		return dateCreation;
	}

}
