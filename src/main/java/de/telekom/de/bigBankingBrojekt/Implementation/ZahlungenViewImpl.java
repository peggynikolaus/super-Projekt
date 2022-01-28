package de.telekom.de.bigBankingBrojekt.Implementation;

import de.telekom.de.bigBankingBrojekt.Interfaces.Zahlung;
import de.telekom.de.bigBankingBrojekt.Interfaces.Zahlungen;
import de.telekom.de.bigBankingBrojekt.Interfaces.ZahlungenView;

public class ZahlungenViewImpl implements ZahlungenView {
	
	public void multiOutput(Zahlungen zahlungen) throws Exception {
		for (Object multiPayment : zahlungen) {
			Zahlung tempZahlung = (Zahlung) multiPayment;
			System.out.println(tempZahlung.getCounter() + " " + tempZahlung.getEmpfaenger() +
						      " " + tempZahlung.getBetrag() + tempZahlung.getWaehrung());
		}
	}

}
