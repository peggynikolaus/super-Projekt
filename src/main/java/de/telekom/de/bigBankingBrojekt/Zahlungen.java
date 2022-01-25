package de.telekom.de.bigBankingBrojekt;

import java.io.IOException;
import java.util.Iterator;

public interface Zahlungen extends Iterable {
	
	void addZahlung(Object zahlung);
	public void multiImport() throws IOException;
	
	Object get(int position);
	
	Iterator iterator();

}
