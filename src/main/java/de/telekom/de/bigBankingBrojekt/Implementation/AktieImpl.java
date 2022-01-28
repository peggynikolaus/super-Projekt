package de.telekom.de.bigBankingBrojekt.Implementation;

import de.telekom.de.bigBankingBrojekt.Interfaces.Aktie;

public class AktieImpl implements Aktie {
	
	private int wkz;
	private String name;
	private double kaufkurs;
	private int counter;

	public AktieImpl(int wkz, String name, double kaufkurs, int counter) {
		
		this.wkz = wkz;
		this.name = name;
		this.kaufkurs = kaufkurs;
		this.counter = counter;
		
	}

	public int getWkz() {
		return wkz;
	}

	public String getName() {
		return name;
	}

	public double getKaufkurs() {
		return kaufkurs;
	}

	public int getCounter() {
		return counter;
	}
	
	
	
}
