package de.telekom.sea7.nextLevelBanking;

import java.util.Scanner;

public class TransactionView {
	

	
	private SingleTransactionModel sT;
	
	
	
	// Menü
	public void menu() {
		String eingabe = "";
		Scanner scanner = new Scanner(System.in);
		
		while(eingabe.equals("exit")) {
			System.out.println("Bitte gib eine Aktion ein (z.B. show, exit)");
			eingabe = scanner.nextLine();
			
			switch (eingabe) {
			case "show":	
				System.out.println("Du hast dich für die Anzeige einer Überweisung entschieden. Hier bitte: \n ");
				ausgeben();
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

	
	
	public SingleTransactionModel getsT() {
		return sT;
	}

	public void setsT(SingleTransactionModel sT) {
		this.sT = sT;
	}
	

}
