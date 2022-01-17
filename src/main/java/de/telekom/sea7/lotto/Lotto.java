package de.telekom.sea7.lotto;

import java.util.Arrays;

public class Lotto {
	private int speicherposition = 0;
	private int[] lottozahlen = new int[7];

	public int[] getLottozahlen() {
		// Methode sollte noch verbessert werden damit man eine einzelen Zahl ausgeben kann
		return lottozahlen;
	}

	public void setLottozahlen(int lottozahl) {
		if (lottozahl < 1 || lottozahl > 49) {
			System.out.println("Nur Werte zwischen 1 und 49 sind gueltig");
		} else {
			if (speicherposition > 6) {
				System.out.println("Es duerfen nur 7 Zahlen angekreuzt werden!");
			} else {
				this.lottozahlen[speicherposition] = lottozahl;
				speicherposition++;
			}
		}
	}

	public void ausgabeLottoschein() {
		for (int i = 0; i < lottozahlen.length; i++) {
			System.out.println(lottozahlen[i]);
		}
	}

	

	public void pruefungZahlen() {
        Lottogesellschaft lottogesellschaft = new Lottogesellschaft();
        Object[] anArray = new Object[] {lottozahlen};
        Object[] anotherArray = new Object[] {lottogesellschaft.ziehungSamstag};
        System.out.println(Arrays.deepEquals(anArray,anotherArray));
    }
	
	
}
