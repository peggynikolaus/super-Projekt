package de.telekom.de.bigBankingBrojekt;

import java.io.IOException;

public interface ZahlungenView {
	void multiOutput(Zahlungen zahlungen);
	void multiExport(Zahlungen zahlungen) throws IOException;
	Zahlungen testZahlungen();
}
