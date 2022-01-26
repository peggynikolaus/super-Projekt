package de.telekom.de.bigBankingBrojekt.Interfaces;

public interface ZahlungView {
	
	String singleOutput(Zahlung zahlung) throws Exception;
	Zahlung testZahlung();

}
