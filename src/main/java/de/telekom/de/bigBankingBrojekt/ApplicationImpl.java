package de.telekom.de.bigBankingBrojekt;

public class ApplicationImpl implements Application {
	
	private ZahlungView zahlungView = new ZahlungViewImpl();
	private Zahlungen zahlungen = new ZahlungenImpl();
	private ZahlungenView zahlungenView = new ZahlungenViewImpl();
	
	public void run(String[] args) {
		
		ZahlungImpl test = new ZahlungImpl("Peggy", "DE1234", "BIC1234", 200.0, "€", "Hundefutter");
		
		//zahlungView.singleOutput(test);
		System.out.println(zahlungView.singleOutput(test));

		zahlungen.addZahlung(test);
		zahlungen.addZahlung(test);
		zahlungenView.multiOutput(zahlungen);
	}

}
