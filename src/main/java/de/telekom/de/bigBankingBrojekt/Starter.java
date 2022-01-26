package de.telekom.de.bigBankingBrojekt;

import java.io.IOException;

import de.telekom.de.bigBankingBrojekt.Implementation.ApplicationImpl;
import de.telekom.de.bigBankingBrojekt.Interfaces.Application;

public class Starter {

	public static void main(String[] args) throws Exception, IOException {
		
		Application application = new ApplicationImpl();
		
		application.run(args);
	}

}