package de.telekom.de.Weihnachtsgans;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class WeihnachtsgansImpl {

	public LocalDate heute = LocalDate.now();
	public LocalDate goal = LocalDate.of(2022, 12, 25);
	public LocalTime zeitJetzt = LocalTime.now();
	
	// Datum formatieren
	LocalDate dateF = LocalDate.of(2022, 8, 9);
	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
	
}
