package de.telekom.de.bigBankingBrojekt.Implementation;

import java.io.IOException;
import java.util.Scanner;

import de.telekom.de.bigBankingBrojekt.Interfaces.Aktien;
import de.telekom.de.bigBankingBrojekt.Interfaces.AktienView;
import de.telekom.de.bigBankingBrojekt.Interfaces.MenuView;
import de.telekom.de.bigBankingBrojekt.Interfaces.ZahlungView;
import de.telekom.de.bigBankingBrojekt.Interfaces.Zahlungen;
import de.telekom.de.bigBankingBrojekt.Interfaces.ZahlungenView;

public class MenuViewImpl implements MenuView {

	private ZahlungView zahlungView = new ZahlungViewImpl();
	private ZahlungenView zahlungenView = new ZahlungenViewImpl();
	private Zahlungen zahlungen = new ZahlungenImpl();
	private Aktien aktien = new AktienImpl();
	private AktienView aktienView = new AktienViewImpl();

	public void menu() throws Exception {
		String eingabe = "";
		Scanner scanner = new Scanner(System.in);
		/** Scanner für Eingabe geöffnet */

		while (!eingabe.equals("exit")) {
			System.out.println("");
			System.out.println("Bitte gib eine Aktion ein (z.B. show, showAll, exportAll, importAll, showAktien, importAktien, exportAktien, exit)");
			eingabe = scanner.nextLine();

			switch (eingabe) {
			case "show":
				System.out.println("Du hast dich für die Anzeige einer Überweisung entschieden. gib bitte die Position an: \n ");
				int input = scanner.nextInt();
				System.out.println(zahlungView.detailOutput(zahlungen, input));
				break;
			case "showAll":
				System.out.println("Du hast dich für die Übersicht aller Überweisung entschieden. Hier bitte: \n ");
				zahlungenView.multiOutput(zahlungen);
				break;
			case "exportAll":
				System.out.println("Ihre Daten wurden erfolgreich in einer externen Datei gespeichert.  \n ");
				zahlungen.multiExport(zahlungen);
				break;
			case "importAll":
				System.out.println("Deine Daten wurden aus einer Datei importiert. \n ");
				zahlungen.multiImport();
				break;
			case "showAktien":
				System.out.println("Du hast dich für die Übersicht aller Aktien entschieden. Hier bitte: \n ");
				aktienView.multiOutput(aktien);
				break;
			case "exportAktien":
				System.out.println("Ihre Daten wurden erfolgreich in einer externen Datei gespeichert.  \n ");
				aktien.multiExport(aktien);
				break;
			case "importAktien":
				System.out.println("Deine Daten wurden aus einer Datei importiert. \n ");
				aktien.multiImport();
				break;	
			case "exit":
				System.out.println("Schön, dass du da warst. Tschüss \n ");
				scanner.close(); /** !!!Scanner für Eingabe bis zum Neustart des Programms geschlossen */
			}
		}
	}

}
