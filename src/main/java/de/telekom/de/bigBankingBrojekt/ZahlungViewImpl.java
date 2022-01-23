package de.telekom.de.bigBankingBrojekt;

public class ZahlungViewImpl implements ZahlungView {

	
	public String singleOutput(Zahlung zahlung) {

		return "Empfänger: " + zahlung.getEmpfaenger() + "\nIBAN Empfänger: " + zahlung.getEmpfaengerIBAN()
				+ "\nBIC Empfänger: " + zahlung.getEmpfaengerBIC() + "\nBetrag: " + zahlung.getBetrag() + " "
				+ zahlung.getWaehrung() + "\nVerwendungszweck: " + zahlung.getVerwendungszweck();

	}

}