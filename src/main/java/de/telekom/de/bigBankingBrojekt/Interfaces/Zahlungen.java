package de.telekom.de.bigBankingBrojekt.Interfaces;

import java.io.IOException;
import java.util.Iterator;

import de.telekom.de.bigBankingBrojekt.OutOfRangeException;

public interface Zahlungen extends Iterable {
	
	//void addZahlung(Object zahlung);
	public void multiImport() throws IOException;
	//Object get(int position) throws OutOfRangeException;
	//Iterator iterator();

}
