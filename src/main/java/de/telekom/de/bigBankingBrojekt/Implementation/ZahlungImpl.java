package de.telekom.de.bigBankingBrojekt.Implementation;

import de.telekom.de.bigBankingBrojekt.Interfaces.Zahlung;

public class ZahlungImpl implements Zahlung {
	
	private String empfaenger;
	private String empfaengerIBAN;
	private String empfaengerBIC;
	private double betrag;
	private String betrag1; // für Alternativen Constructor!! - Sollten wir nicht tun und umbauen!
	private String waehrung;
	private String verwendungszweck;
	
	// Eigener Constructor
	public ZahlungImpl(String empfaenger, String empfaengerIBAN, 
			String empfaengerBIC, double betrag, String waehrung, 
			String verwendungszweck ) {
		
		this.empfaenger = empfaenger;
		this.empfaengerIBAN = empfaengerIBAN;
		this.empfaengerBIC = empfaengerBIC;
		this.betrag = betrag;
		this.waehrung = waehrung;
		this.verwendungszweck = verwendungszweck;
	}
	
	// Eigener alternativer Constructor bei dem Betrag ein String ist - Sollten wir nicht tun und umbauen!
	public ZahlungImpl(String empfaenger, String betrag, String waehrung ) {
		this.empfaenger = empfaenger;
		this.betrag1 = betrag;
		this.waehrung = waehrung;

	}

	// Get Klasse mit Beispiel mit normaler Exception Klasse aus Java
	public String getEmpfaenger() throws Exception {
		if (empfaenger == null) {
			throw new Exception("Der Empfänger darf nicht leer sein.");
		} else {
			return empfaenger;
		}
	}

	// Get Klasse mit Beispiel mit normaler Exception Klasse aus Java
	public String getEmpfaengerIBAN() throws Exception {
		if (empfaengerIBAN == null) {
			throw new Exception("Die IBAN des Empfängers darf nicht leer sein.");
		} else {
			return empfaengerIBAN;
		}
	}

	// Get Klasse mit Beispiel mit normaler Exception Klasse aus Java
	public String getEmpfaengerBIC() throws Exception {
		if (empfaengerBIC == null) {
			throw new Exception("Die BIC des Empfängers darf nicht leer sein.");
		} else {
			return empfaengerBIC;
		}
	}

	// Get Klasse mit Runtime Exception Beispiel
	public double getBetrag() {
		if (betrag > 500) {
			throw new RuntimeException("500 Euro ist viel Geld!! Aus Datenschutzgründen geben wir keine Beträge größer als 500 Euro bekannt.");
		} else {
			return betrag;
		}
	}

	// Get Klasse mit Beispiel mit normaler Exception Klasse aus Java
	public String getWaehrung() throws Exception {
		if (waehrung == null) {
			throw new Exception("Die Währung einer Transaktion darf nicht leer sein.");
		} else {
			return waehrung;
		}
	}

	// Get Klasse mit Beispiel mit normaler Exception Klasse aus Java
	public String getVerwendungszweck() throws Exception {
		if (verwendungszweck == null) {
			throw new Exception("Es fehlt der Verwendungszweck, dies ist nicht erlaubt!");
		} else {
			return verwendungszweck;
		}
	}
	
}
