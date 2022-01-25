package de.telekom.de.bigBankingBrojekt;

import java.io.IOException;

public class Starter {

	public static void main(String[] args) throws IOException {
		
		Application application = new ApplicationImpl();
		
		application.run(args);
	}

}