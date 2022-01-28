package de.telekom.de.bigBankingBrojekt.Implementation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import de.telekom.de.bigBankingBrojekt.Interfaces.Aktie;
import de.telekom.de.bigBankingBrojekt.Interfaces.Aktien;
import de.telekom.de.bigBankingBrojekt.Interfaces.Zahlung;
import de.telekom.de.bigBankingBrojekt.Interfaces.Zahlungen;

public class AktienImpl extends GenericListImpl<Aktie> implements Aktien{

	private int counter = 0;
	
	public void multiImport(/** Aktien this */) throws IOException {
		String line = "";
		String trenner = ";";
		try {
			String filePath = "/home/sea004/eclipse-workspace/super-Projekt/super-Projekt/testInputAktien.csv";
			FileReader fileReader = new FileReader(filePath);

			BufferedReader reader = new BufferedReader(fileReader);
			while ((line = reader.readLine()) != null) {
				String[] ausgeleseneWert = line.split(trenner);
				Aktie temp = new AktieImpl(Integer.parseInt(ausgeleseneWert[0]), ausgeleseneWert[1], 
						Double.parseDouble(ausgeleseneWert[2]), this.counter);
				this.add(temp);
				counter++;
								
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

		private final static String CSV_FILE_NAME = "ExportAktien.csv";

		public void multiExport(Aktien aktien) throws Exception, IOException {

			File csvOutputFile = new File(CSV_FILE_NAME);
			try (PrintWriter pw = new PrintWriter(
					csvOutputFile)) /**
									 * beinhaltet durch die () das close, try > try with ressources
									 */
			{
				pw.write("WKZ; Name; Kaufkurs\n");
				for (Object multiPayment : aktien) {
					Aktie tempAktie = (Aktie) multiPayment;
					String tempSaveLine = tempAktie.getWkz() + ";" + tempAktie.getName() + ";"
							+ tempAktie.getKaufkurs() + "\n";
					pw.write(tempSaveLine);
				}

			}
		}
		
		public int getCounter() {return counter;}

		public void setCounter(int counter) {this.counter = counter;}
		
	}
	

