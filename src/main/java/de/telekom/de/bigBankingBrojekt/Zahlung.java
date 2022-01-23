package de.telekom.de.bigBankingBrojekt;

public interface Zahlung {
	
	String getEmpfaenger();
	String getEmpfaengerIBAN();
	String getEmpfaengerBIC();
	double getBetrag();
	String getWaehrung();
	String getVerwendungszweck();

}
