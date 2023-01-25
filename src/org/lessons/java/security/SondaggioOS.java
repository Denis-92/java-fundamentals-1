package org.lessons.java.security;

import java.util.Scanner; // Import per ricevere input
import java.text.DecimalFormat; // Import per fare l'arrotondamento

public class SondaggioOS {
	
	private static final DecimalFormat round = new DecimalFormat("0.00"); // Necessario per fare gli arrotondamenti

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Facciamo un sondaggio tra gli studenti di quale sistema operativo usano e popoliamo delle variabili.
		
		// Usiamo le variabili per fare semplici calcoli (es. percentuale)
		// 		eventualmente applicando casting tra int e double.
		
		System.out.println("Benvenuto, questo è un sondaggio per misurare l'utilizzo degli OS.");
		
		// Aperto inputContainer
		Scanner inputContainer = new Scanner(System.in);
		
		System.out.print("Quanti utenti utilizzano Windows? ");
		int usersWindows = inputContainer.nextInt();
		
		System.out.print("Quanti utenti utilizzano Linux? ");
		int usersLinux = inputContainer.nextInt();
		
		System.out.print("Quanti utenti utilizzano Mac? ");
		int usersMac = inputContainer.nextInt();
		
		inputContainer.close();
		// Chiuso inputContainer
		
		int totalUsers = usersWindows + usersLinux + usersMac;
		
		double percentageWindowsUsers = 100F * usersWindows / totalUsers;
		System.out.println("Il " + round.format(percentageWindowsUsers) + "% degli utenti usano Windows");
		
		double percentageLinuxUsers = 100F * usersLinux / totalUsers;
		System.out.println("Il " + round.format(percentageLinuxUsers) + "% degli utenti usano Linux");
		
		double percentageMacUsers = 100F * usersMac / totalUsers;
		System.out.println("Il " + round.format(percentageMacUsers) + "% degli utenti usano Mac");
		
	}

}
