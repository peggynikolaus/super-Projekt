package de.telekom.de.bigBankingBrojekt.Implementation;

import java.util.ArrayList;
import java.util.Iterator;

import de.telekom.de.bigBankingBrojekt.OutOfRangeException;

public class GenericListImpl<T> implements Iterable {
	
	ArrayList<T> universalList = new ArrayList<T>();
	
	public void add(T placeholder) {
		universalList.add(placeholder);
	}

	public T get(int position) throws OutOfRangeException {
		if (universalList.size() < 0) {
			throw new OutOfRangeException("Das ist nicht möglich!");
		} else {
			return universalList.get(position);
		}
	}
			
	public int size() {
		return universalList.size();
	}
	
	public Iterator iterator() {
		return universalList.iterator();
	}
	
	

}
