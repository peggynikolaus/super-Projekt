package de.telekom.de.bigBankingBrojekt.Interfaces;

import java.io.IOException;

public interface Aktien extends GenericList<Aktie> {
	
	void multiImport(/** Aktien this */) throws IOException;
	void multiExport(Aktien aktien) throws Exception, IOException;
	int getCounter();
	void setCounter(int counter);

}
