package org.lessons.java.fizzbuzz;

public class FizzBuzz {

	public static void main(String[] args) {
		// Scrivi un programma che stampi i numeri da 1 a 100,
		//		ma per i multipli di 3 stampi “Fizz” al posto del numero
		//		e per i multipli di 5 stampi Buzz.
		// Per i numeri che sono sia multipli di 3 che di 5 stampi FizzBuzz.
		
			
		for (int i = 1; i <= 100; i++ ) {
			
			boolean Fizz = i % 3 == 0;
			
			boolean Buzz = i % 5 == 0;
			
			if (Fizz && Buzz) {
				
				System.out.println("FizzBuzz");
				
			} else {
				
				if (Fizz) {
					
					System.out.println("Fizz");
					
				} else {
					
					if (Buzz) {
				
						System.out.println("Buzz");
					
					} else {
					
						System.out.println(i);
						
					}
				}	
			}
		}

	}

}
