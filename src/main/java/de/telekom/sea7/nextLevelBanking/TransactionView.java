package de.telekom.sea7.nextLevelBanking;

import java.util.Scanner;

public class TransactionView {
	
	// SCANNER Initialisieren
	// Scanner scanner = new Scanner(System.in);
	// Scanner Eingaben in der Eingabe input speichern
	// String input = scanner.nextLine();
	
	private SingleTransactionModel sT;
	
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

	
	
	public SingleTransactionModel getsT() {
		return sT;
	}

	public void setsT(SingleTransactionModel sT) {
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
