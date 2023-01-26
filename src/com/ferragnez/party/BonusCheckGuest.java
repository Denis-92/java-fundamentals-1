package com.ferragnez.party;

import java.util.Scanner;

public class BonusCheckGuest {

	public static void main(String[] args) {
		
		// Bonus se avete usato il ciclo for per cercare il nome nella lista nella consegna base,
		// implementare lo stesso programma usando il ciclo while, e viceversa
		
		String[] listaInvitati = {
				"Dua Lipa",
				"Paris Hilton",
				"Manuel Agnelli",
				"J-Ax",
				"Francesco Totti",
				"Ilary Blasi",
				"Bebe Vio",
				"Luis",
				"Pardis Zarei",
				"Martina Maccherone",
				"Rachel Zeili"
		};
		
		System.out.print("Benvenut* alla festa dei Ferragnez, posso chiederle il nome? ");
		
		// Aperto inputContainer
		Scanner inputContainer = new Scanner(System.in);
		
		String name = inputContainer.nextLine();
		
		inputContainer.close();
		// Chiuso inputContainer
		
		boolean invited = false;
		
		int i = 0;
			
		while ( i < listaInvitati.length ) {
			if ( name.equalsIgnoreCase(listaInvitati[i]) ) {
				invited = true;
			}
			i++;
		}
		
		if (invited) {
			System.out.println(name + " che piacere vederla, la stavamo aspettando! Prego entri pure e buona serata!");
		} else {
			System.out.println("Se ne vada! Questo è un party esclusivo!!!");
		}
		
	}

}
