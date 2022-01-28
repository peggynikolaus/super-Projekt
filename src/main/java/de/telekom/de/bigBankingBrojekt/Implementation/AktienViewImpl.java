package de.telekom.de.bigBankingBrojekt.Implementation;

import de.telekom.de.bigBankingBrojekt.Interfaces.Aktie;
import de.telekom.de.bigBankingBrojekt.Interfaces.Aktien;
import de.telekom.de.bigBankingBrojekt.Interfaces.AktienView;


public class AktienViewImpl implements AktienView {
	
	public void multiOutput(Aktien aktien) throws Exception {
		for (Object multiPayment : aktien) {
			Aktie tempAktie = (Aktie) multiPayment;
			System.out.println(tempAktie.getCounter() + " " + tempAktie.getWkz() +
						      " " + tempAktie.getName() + tempAktie.getKaufkurs());
		}
	}

}
