package de.telekom.sea7.nextLevelBanking;

import java.util.Scanner;

public class singleTransactionController {
	
	// Eigene Run Methode um direkt Objektorientiert zu sein
	public void run(String[] args) {
		
		// Instanz eines Models erstellen
		singleTransactionModel sT = new singleTransactionModel("TestEmpfaenger", "DE12TESTIBAN123", "BICXXX", 12.5, "€" );
		
		// Instanz einer View erstellen
		transactionView tV = new transactionView();
		
		// Model und View bekannt machen
		tV.setsT(sT);
		
		// Aufruf der Ausgabenmethode aus der View
		tV.ausgeben();
		
	}
	
}
