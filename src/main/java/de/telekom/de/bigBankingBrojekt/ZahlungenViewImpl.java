package de.telekom.de.bigBankingBrojekt;

public class ZahlungenViewImpl implements ZahlungenView {

	public void multiOutput(Zahlungen zahlungen) {
		for (Object multiPayment : zahlungen) {
			System.out.println("TEST");
// next step: einzelne Daten ausgeben
		}

	}

}