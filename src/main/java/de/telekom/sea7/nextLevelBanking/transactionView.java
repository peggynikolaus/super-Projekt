package de.telekom.sea7.nextLevelBanking;

import java.util.Scanner;

public class transactionView {
	
	// SCANNER Initialisieren
	// Scanner scanner = new Scanner(System.in);
	// Scanner Eingaben in der Eingabe input speichern
	// String input = scanner.nextLine();
	
	private singleTransactionModel sT;
	
	// Get/-Set für die sT Variable
	
	
	
	public void ausgeben() {
		System.out.println(
				"Empfänger: " +
				sT.getEmpfaenger() +
				"\nIBAN Empfänger: " +
				sT.getEmpfaengerIban() +
				"\nBIC Empfänger: " +
				sT.getEmpfaengerBic() +
				"\nBetrag: " +
				sT.getBetrag() + " " +
				sT.getWaehrung() +
				"\nVerwendungszweck: " +
				sT.getVerwendungszweck());
	}

	
	
	public singleTransactionModel getsT() {
		return sT;
	}

	public void setsT(singleTransactionModel sT) {
		this.sT = sT;
	}
	
	// Neue Überweisung anlegen
     
	/*
	private String 	empfaenger;
	private String 	empfaengerIban;
	private String 	empfaengerBic;
	private double 	betrag;
	private String	waehrung;
	private String	verwendungszweck;
 */
}
