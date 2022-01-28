package de.telekom.de.bigBankingBrojekt.Implementation;

import de.telekom.de.bigBankingBrojekt.Interfaces.Aktie;
import de.telekom.de.bigBankingBrojekt.Interfaces.AktieView;
import de.telekom.de.bigBankingBrojekt.Interfaces.Aktien;

public class AktieViewImpl implements AktieView {
	
	public String detailOutput(Aktien aktien, int position) throws Exception {
		Aktie aktie = aktien.get(position);
		return "WKZ: " + aktie.getWkz() + "\nName: " + aktie.getName()
				+ "\nKaufkurs: " + aktie.getKaufkurs();

	}

}
