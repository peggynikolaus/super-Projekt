package de.telekom.de.bigBankingBrojekt.Implementation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import de.telekom.de.bigBankingBrojekt.OutOfRangeException;
import de.telekom.de.bigBankingBrojekt.Interfaces.Zahlungen;

public class ZahlungenImpl implements Zahlungen, Iterable {

	ArrayList<Object> paymentsList = new ArrayList<>();

	public void addZahlung(Object zahlung) {
		paymentsList.add(zahlung);
	}
	
	public void multiImport() throws IOException {
	String line = "";
    String trenner = ";";
    try
    {
        String filePath = "/home/sea20/eclipse-workspace/super-Projekt/super-Projekt/testInput.csv";
        FileReader fileReader = new FileReader(filePath);

        BufferedReader reader = new BufferedReader(fileReader);
        while ((line = reader.readLine()) != null)  
        {
           String[] ausgeleseneWert = line.split(trenner);  
         
           
           // HIER WOLLEN WIR DAS ANHÄNGEN INS ARRAY NOCH AUSGESTSLTEN!
           // Double.parseDouble(ausgeleseneWert[1]) <- einbauen!
           // Zahlung test = new ZahlungImpl(ausgeleseneWert[0], ausgeleseneWert[1], ausgeleseneWert[2]);
           // this.addZahlung(test);
           System.out.println(ausgeleseneWert[0] + " | "+ ausgeleseneWert[1]+ " | "+ ausgeleseneWert[2]);
           
        }
    }
    catch (IOException e)
    {
        e.printStackTrace();
    }
	}
	
	
	
	
	public Object get(int position) throws OutOfRangeException {
		if (paymentsList.size() < 0) {
			throw new OutOfRangeException("Das ist nicht möglich!");
		} else {
			return paymentsList.get(position);
		}
	}
		
	
	public int size() {
		return paymentsList.size();
	}
	
	public Iterator iterator() {
		return paymentsList.iterator();
	}



}
