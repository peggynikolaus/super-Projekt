package de.telekom.de.bigBankingBrojekt;

public class ZahlungViewImpl implements ZahlungView {

	
	public String singleOutput(Zahlung zahlung) {

		return "Empfänger: " + zahlung.getEmpfaenger() + "\nIBAN Empfänger: " + zahlung.getEmpfaengerIBAN()
				+ "\nBIC Empfänger: " + zahlung.getEmpfaengerBIC() + "\nBetrag: " + zahlung.getBetrag() + " "
				+ zahlung.getWaehrung() + "\nVerwendungszweck: " + zahlung.getVerwendungszweck();

	}
	
	public Zahlung testZahlung() {
		return new ZahlungImpl("Testkunde", "TestIBAN", "TestBIC", 222.22, "Eruo", "Test Verwendung");
	}
}	
