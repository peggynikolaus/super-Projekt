package de.telekom.sea7.nextLevelBanking;

import java.util.Scanner;

public class SingleTransactionController {
	
	// Eigene Run Methode um direkt Objektorientiert zu sein
	public void run(String[] args) {
		
		// Instanz eines Models erstellen
		SingleTransactionModel sT = new SingleTransactionModel("TestEmpfaenger", "DE12TESTIBAN123", "BICXXX", 12.5, "€" );
		
		// Instanz einer View erstellen
		TransactionView tV = new TransactionView();
		
		// Model und View bekannt machen
		tV.setsT(sT);
		
		// Aufruf der Ausgabenmethode aus der View
		tV.ausgeben();
		
	}
	
}
