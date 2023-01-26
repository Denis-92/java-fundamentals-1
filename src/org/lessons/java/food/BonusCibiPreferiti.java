package org.lessons.java.food;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class BonusCibiPreferiti {
	
	private static final DecimalFormat round = new DecimalFormat("0"); // Necessario per fare gli arrotondamenti

	public static void main(String[] args) {

		// BONUS Stampate a video anche il cibo di mezza classifica, cioè che si trova nella posizione mediana
		
		String[] cibiPreferiti = {
				"Patate in tecia",
				"Gnocchi di susine",
				"Jota",
				"Pizza rucola e grana",
				"Pasta all'arrabbiata",
				"Gnocchi al pomodoro",
				"Pollo al forno"
		};
		
		round.setRoundingMode(RoundingMode.DOWN);
		int middleElementArray = Integer.parseInt(round.format( cibiPreferiti.length / 2 ));
		
		System.out.println("BONUS: Cibo preferito di metà classifica - " + cibiPreferiti[middleElementArray]);
	}
}
