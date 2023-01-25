package org.lessons.java.security;

import java.util.Scanner; // Import della classe Scanner per ricevere input

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Il programma deve fare quanto segue:
		
		// salvare in opportune variabili il nome, cognome, colore preferito e
		// 		data di nascita di un utente suddivisa in giorno, mese e anno in numero
		
		// generare (e stampare a video) una password concatenando nome, cognome, colore preferito
		// 		e somma di giorno, mese e anno di nascita, separate dal carattere -
		
		// Esempio: ho un utente che si chiama Pinco Pallo, nato il 12/05/1994, il cui colore preferito è il magenta
		//		La sua password sarà Pinco-Pallo-magenta-2011
		
		System.out.println("Benvenuto, sei nel password generator, immetti i tuoi dati per ricevere una password personalizzato!");
		
		// Aperto inputContainer
		Scanner inputContainer = new Scanner(System.in);
		
		System.out.print("Inserisci il tuo nome: ");
		String name = inputContainer.nextLine();
		
		System.out.print("Inserisci il tuo cognome: ");
		String surname = inputContainer.nextLine();
		
		System.out.print("Inserisci il tuo colore preferito: ");
		String favouriteColor = inputContainer.nextLine();
		
		System.out.print("Inserisci la tua data di nascita (solo il giorno): ");
		int dateBirthDay = inputContainer.nextInt();
		
		System.out.print("Inserisci la tua data di nascita (solo il mese): ");
		int dateBirthMonth = inputContainer.nextInt();
		
		System.out.print("Inserisci la tua data di nascita (solo l'anno): ");
		int dateBirthYear = inputContainer.nextInt();
		
		inputContainer.close();
		// Chiuso inputContainer
		
		int sumDateBirth = dateBirthDay + dateBirthMonth + dateBirthYear;
		
		System.out.println(
				"Ti ho generato questa password personalizzata: " +
				name + "-" +
				surname + "-" +
				favouriteColor + "-" +
				sumDateBirth
		);
		
	}

}
