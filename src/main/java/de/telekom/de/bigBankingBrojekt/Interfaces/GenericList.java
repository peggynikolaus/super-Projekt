package de.telekom.de.bigBankingBrojekt.Interfaces;

import java.util.Iterator;

public interface GenericList<T> {
	
	void add ();
	
	T get ();
	
	int size();
	
	Iterator iterator();
}
