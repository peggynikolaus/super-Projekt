package de.telekom.sea7.nextLevelBanking;

import java.util.Scanner;

public class TransactionView {
	

	
	private SingleTransactionModel sT;
	
	
	
	// Menü
	public void menu() {
		String eingabe = "";
		Scanner scanner = new Scanner(System.in);
		
		while(!eingabe.equals("exit")) {
			System.out.println("");
			System.out.println("Bitte gib eine Aktion ein (z.B. show, exit, input)");
			eingabe = scanner.nextLine();
			
			switch (eingabe) {
			case "show":	
				System.out.println("Du hast dich für die Anzeige einer Überweisung entschieden. Hier bitte: \n ");
				ausgeben();
					break;
			case "input":
				eingeben();
				break;
			case "exit": 
				System.out.println("Schön, dass du da warst. Tschüss \n ");
			}
			
		}
		
		
		
		
		
	}
	
	
	
	// Methoden die aus dem Menü aufgerufen werden können
	
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

	public void eingeben() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte gib einen Empfänger an:");
		String eingabeEmpfaenger = scanner.nextLine();
		
		System.out.println("Bitte gib eine IBAN an:");
		String eingabeIban = scanner.nextLine();
		
		System.out.println("Bitte gib eine BIC an:");
		String eingabeBic = scanner.nextLine();
		
		System.out.println("Bitte gib einen Betrag an:");
		double eingabeBetrag = scanner.nextDouble();
		
		System.out.println("Bitte gib die Währung an:");
		String eingabeWaehrung = scanner.nextLine();
		
		System.out.println("Bitte gib den Verwendungszweck an:");
		String eingabeZweck = scanner.nextLine();
		
				
		SingleTransactionModel sTm = new SingleTransactionModel(eingabeEmpfaenger, eingabeIban, eingabeBic, eingabeBetrag, eingabeWaehrung, eingabeZweck);
		
		System.out.println("");
		System.out.println("Zur Kontrolle, hier deine eigegebenen Daten:");
		
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
	

}
