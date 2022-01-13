package de.telekom.sea7.nextLevelBanking;

public class SingleTransactionModel {
	
	// Properties
	private String 	empfaenger;
	private String 	empfaengerIban;
	private String 	empfaengerBic;
	private double 	betrag;
	private String	waehrung;
	private String	verwendungszweck;
	
	// Eigener Constructor mit Verwendungszweck
	public SingleTransactionModel(String empfaenger, String empfaengerIban, String empfaengerBic, double betrag, String waehrung, String	verwendungszweck) {
		this.empfaenger = empfaenger;
		this.empfaengerIban = empfaengerIban;
		this.empfaengerBic = empfaengerBic;
		this.betrag = betrag;
		this.waehrung = waehrung;
		this.verwendungszweck = verwendungszweck;
	}
	
	// Zweiter Constructor ohne Verwendungszweck
	public SingleTransactionModel(String empfaenger, String empfaengerIban, String empfaengerBic, double betrag, String waehrung) {
		this.empfaenger = empfaenger;
		this.empfaengerIban = empfaengerIban;
		this.empfaengerBic = empfaengerBic;
		this.betrag = betrag;
		this.waehrung = waehrung;
	}
	
	// Get-/Set-Methoden
	public String getEmpfaenger() {
		return empfaenger;
	}
	public void setEmpfaenger(String empfaenger) {
		this.empfaenger = empfaenger;
	}
	public String getEmpfaengerIban() {
		return empfaengerIban;
	}
	public void setEmpfaengerIban(String empfaengerIban) {
		this.empfaengerIban = empfaengerIban;
	}
	public String getEmpfaengerBic() {
		return empfaengerBic;
	}
	public void setEmpfaengerBic(String empfaengerBic) {
		this.empfaengerBic = empfaengerBic;
	}
	public double getBetrag() {
		return betrag;
	}
	public void setBetrag(double betrag) {
		this.betrag = betrag;
	}
	public String getWaehrung() {
		return waehrung;
	}
	public void setWaehrung(String waehrung) {
		this.waehrung = waehrung;
	}
	public String getVerwendungszweck() {
		return verwendungszweck;
	}
	public void setVerwendungszweck(String verwendungszweck) {
		this.verwendungszweck = verwendungszweck;
	}
	
	

}
