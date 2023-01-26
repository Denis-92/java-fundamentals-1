package org.lessons.java.food;

public class CibiPreferiti {

	public static void main(String[] args) {
		// Nel programma inizializzate un array (con i metodi visti a lezione)
		// con la classifica dei vostri cibi preferiti (minimo 5, massimo 10 elementi)
		// Poi stampate a video:
		// 		- la lunghezza della classifica
		//		- il vostro cibo top (prima posizione della classifica)
		//		- il vostro cibo preferito ma non troppo (ultima posizione della classifica)
		// Le modalità di consegna sono le solite:
		//		repo GitHub, file .gitignore, commit e push
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
		
		System.out.println("Sono presenti " + cibiPreferiti.length + " cibi nella lista.");
		
		System.out.println("Cibo preferito top!!! - " + cibiPreferiti[0]);
		
		int lastElementArray = cibiPreferiti.length - 1;
		
		System.out.println("Cibo preferito (ma non troppo...) - " + cibiPreferiti[lastElementArray]);	

	}

}
