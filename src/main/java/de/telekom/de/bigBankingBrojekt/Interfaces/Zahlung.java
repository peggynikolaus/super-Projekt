package de.telekom.de.bigBankingBrojekt.Interfaces;

public interface Zahlung {
	
	String getEmpfaenger() throws Exception;
	String getEmpfaengerIBAN() throws Exception;
	String getEmpfaengerBIC() throws Exception;
	double getBetrag() ;
	String getWaehrung() throws Exception;
	String getVerwendungszweck() throws Exception;

}
