package com.ferragnez.party;

import java.util.Scanner; // Import della classe Scanner per ricevere input

public class CheckGuest {

	public static void main(String[] args) {
		// State lavorando col servizio di sicurezza dei Ferragnez e il vostro compito è di assicurarvi
		// 		che accedano alla festa solo gli invitati presenti sulla lista (in fondo al post)
		
		// Consegna: creare un progetto java-festa-ferragnez con il package com.ferragnez.party,
		// 		a cui aggiungere la classe CheckGuest
				
		// Nel programma bisogna: creare e inizializzare l’array contenente i nomi degli invitati
		// 		chiedere all’utente come si chiama
		//		verificare che il nome sia presente nella lista
		//		lasciarlo entrare o rispedirlo cortesemente da dove è venuto
				
		// Bonus se avete usato il ciclo for per cercare il nome nella lista nella consegna base,
		// implementare lo stesso programma usando il ciclo while, e viceversa
				
		// Lista invitati: Dua Lipa, Paris Hilton, Manuel Agnelli, J-Ax, Francesco Totti, Ilary Blasi,
		//					Bebe Vio, Luis, Pardis Zarei, Martina Maccherone, Rachel Zeili
		
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
			
		for ( int i = 0; i < listaInvitati.length; i++) {
			if ( name.equalsIgnoreCase(listaInvitati[i]) ) {
				invited = true;
			}
			//System.out.println(invited);
		}
		
		if (invited) {
			System.out.println(name + " che piacere vederla, la stavamo aspettando! Prego entri pure e buona serata!");
		} else {
			System.out.println("Se ne vada! Questo è un party esclusivo!!!");
		}		
	}
}
