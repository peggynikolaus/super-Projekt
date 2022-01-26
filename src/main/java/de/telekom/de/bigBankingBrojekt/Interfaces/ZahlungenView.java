package de.telekom.de.bigBankingBrojekt.Interfaces;

import java.io.IOException;

public interface ZahlungenView {
	void multiOutput(Zahlungen zahlungen) throws Exception;
	void multiExport(Zahlungen zahlungen) throws IOException, Exception;
	Zahlungen testZahlungen();
}
