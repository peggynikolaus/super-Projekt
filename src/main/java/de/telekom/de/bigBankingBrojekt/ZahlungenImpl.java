package de.telekom.de.bigBankingBrojekt;

import java.util.ArrayList;
import java.util.Iterator;

public class ZahlungenImpl implements Zahlungen, Iterable {

	ArrayList<Object> paymentsList = new ArrayList<>();

	public void addZahlung(Object zahlung) {

		paymentsList.add(zahlung);
	}

	public Object get(int position) {
		return paymentsList.get(position);
	}
	
	public int size() {
		return paymentsList.size();
	}
	
	public Iterator iterator() {
		return paymentsList.iterator();
	}

}
