package org.lessons.java.train;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcolaBiglietto {
	
	private static final DecimalFormat round = new DecimalFormat("0.00"); // Necessario per fare gli arrotondamenti

	public static void main(String[] args) {

		// Il programma dovrà chiedere all’utente il numero di chilometri che vuole percorrere e l’età del passeggero.
		// Sulla base di queste informazioni dovrà calcolare il prezzo totale del viaggio, secondo queste regole:
		//		il prezzo del biglietto è definito in base ai km (0.21 € al km)
		//		va applicato uno sconto del 20% per i minorenni
		//		va applicato uno sconto del 40% per gli over 65
				
		// Come sempre create un progetto java con lo stesso nome del repo (java-biglietto-treno),
		// aggiungete un package org.lessons.java e una classe CalcolaBiglietto.
		// Il programma va implementato nel metodo main della classe CalcolaBiglietto.
		// Per acquisire l’input dell’utente usate la classe Scanner, come visto stamattina a lezione.
		
		
		System.out.println("Benvenuto, inserisci i dati richiesti per calcolare il costo del biglietto del treno.");
		
		// Aperto inputContainer
		Scanner inputContainer = new Scanner(System.in);
		
		System.out.print("Quanti chilometri devi percorrere? ");
		int distanzaTragitto = Integer.parseInt(inputContainer.nextLine());
		
		System.out.print("Quanti anni ha il passeggero? ");
		int etaPasseggero = Integer.parseInt(inputContainer.nextLine());
		
		inputContainer.close();
		// Chiuso inputContainer
		
		
		float prezzoBase = 0.21F * distanzaTragitto;
		
		float scontoStudente = 0.2F;
		
		float scontoSenior = 0.4F;
		
		boolean passeggeroStudente = etaPasseggero < 18;
		// System.out.println("Studente? " + passeggeroStudente);
		
		boolean passeggeroSenior = etaPasseggero > 65;
		// System.out.println("Senior? " + passeggeroSenior);
		
		float prezzoFinale;
		
		if (passeggeroStudente) {
			prezzoFinale = prezzoBase * (1F - scontoStudente);
			System.out.print("Il prezzo del biglietto è: " + round.format(prezzoFinale) + "€");
		}
		
		if (passeggeroSenior) {
			prezzoFinale = prezzoBase * (1F - scontoSenior);
			System.out.print("Il prezzo del biglietto è: " + round.format(prezzoFinale) + "€");
		}
		
		if (!passeggeroStudente && !passeggeroSenior) {
			System.out.print("Il prezzo del biglietto è: " + round.format(prezzoBase) + "€");
		}		

	}

}
