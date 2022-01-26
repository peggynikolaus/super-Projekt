package de.telekom.de.bigBankingBrojekt.Implementation;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import de.telekom.de.bigBankingBrojekt.Interfaces.Zahlung;
import de.telekom.de.bigBankingBrojekt.Interfaces.Zahlungen;
import de.telekom.de.bigBankingBrojekt.Interfaces.ZahlungenView;

public class ZahlungenViewImpl implements ZahlungenView {

	private final static String CSV_FILE_NAME = "ExportAll.csv";
	
	public void multiOutput(Zahlungen zahlungen) throws Exception {
		for (Object multiPayment : zahlungen) {
			Zahlung tempZahlung = (Zahlung)multiPayment;
			System.out.println(tempZahlung.getEmpfaenger() + " " + tempZahlung.getBetrag() + tempZahlung.getWaehrung());
		}		
	}
	
	// Umzug nach ZahlungenImpl wäre irgendwie logisch
	// Überschriften manuell an Position 0 appenden!!! OFFENES ToDo
	public void multiExport(Zahlungen zahlungen) throws Exception, IOException {

		File csvOutputFile = new File(CSV_FILE_NAME);
		 try (PrintWriter pw = new PrintWriter(csvOutputFile)) 
		{
			// PrintWriter pw = new PrintWriter(csvOutputFile);
			for (Object multiPayment : zahlungen) {
				Zahlung tempZahlung = (Zahlung) multiPayment;
				String tempSaveLine = tempZahlung.getEmpfaenger() + ";" + tempZahlung.getBetrag() + ";"
						+ tempZahlung.getWaehrung() + "\n";
				pw.write(tempSaveLine);
			}
			//pw.close();
		}
	}
	
	

	

	public Zahlungen testZahlungen() {
	ZahlungImpl test1 = new ZahlungImpl("Test1", "DE1", "BIC1234",
			100, "€", "Hundefutter");
	ZahlungImpl test2 = new ZahlungImpl("Test2", "DE2", "BIC1234",
			200, "€", "Hundefutter");
	ZahlungImpl test3 = new ZahlungImpl("Test3", "DE3", "BIC1234",
			300, "€", "Hundefutter");
	Zahlungen zahlungen = new ZahlungenImpl();
	zahlungen.addZahlung(test1);
	zahlungen.addZahlung(test2);
	zahlungen.addZahlung(test3);
	return zahlungen;
	}
}

