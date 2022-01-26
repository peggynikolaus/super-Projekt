package de.telekom.de.bigBankingBrojekt.Implementation;

import java.io.IOException;
import java.util.Scanner;

import de.telekom.de.bigBankingBrojekt.Interfaces.MenuView;
import de.telekom.de.bigBankingBrojekt.Interfaces.ZahlungView;
import de.telekom.de.bigBankingBrojekt.Interfaces.Zahlungen;
import de.telekom.de.bigBankingBrojekt.Interfaces.ZahlungenView;

public class MenuViewImpl implements MenuView {
	
	private ZahlungView zahlungView = new ZahlungViewImpl();
	private ZahlungenView zahlungenView = new ZahlungenViewImpl();
	private Zahlungen zahlungen = new ZahlungenImpl();
	
	public void menu() throws Exception {
		String eingabe = "";
		Scanner scanner = new Scanner(System.in);
		
		while (!eingabe.equals("exit")) {
			System.out.println("");
			System.out.println("Bitte gib eine Aktion ein (z.B. show, showAll, exportAll, importAll, exit)");
			eingabe = scanner.nextLine();

			switch (eingabe) {
			case "show":
				System.out.println("Du hast dich für die Anzeige einer Überweisung entschieden. Hier bitte: \n ");
				System.out.println(zahlungView.singleOutput(zahlungView.testZahlung()));
				break;
			case "showAll":
				System.out.println("Du hast dich für die Übersicht aller Überweisung entschieden. Hier bitte: \n ");
				Zahlungen testzahlungen = zahlungenView.testZahlungen();
				zahlungenView.multiOutput(testzahlungen);
				break;
			case "exportAll":
				System.out.println("Folgende Daten wurden erfolgreich eingelesen: \n ");
				Zahlungen testExportzahlungen = zahlungenView.testZahlungen();
				zahlungenView.multiExport(testExportzahlungen);
				break;
			case "importAll":
				System.out.println("Deine Daten wurden in eine Datei exportiert: \n ");
				zahlungen.multiImport();
				break;
			case "exit":
				System.out.println("Schön, dass du da warst. Tschüss \n ");
			    scanner.close();
			}
		}
	}

}
