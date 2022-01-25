package de.telekom.de.bigBankingBrojekt;

import java.io.IOException;

public class ApplicationImpl implements Application {
	
	private ZahlungView zahlungView = new ZahlungViewImpl();
	private Zahlungen zahlungen = new ZahlungenImpl();
	private ZahlungenView zahlungenView = new ZahlungenViewImpl();
	
	private MenuView menuView = new MenuViewImpl();
	
	public void run(String[] args) throws IOException {
		
		menuView.menu();
		

	}

}
