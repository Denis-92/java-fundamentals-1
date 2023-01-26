package org.lessons.java.palindrome;

public class Palindrome {

	public static void main(String[] args) {
		
		// A palindromic number reads the same both ways.
		// The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

		// Find the largest palindrome made from the product of two 3-digit numbers.
		int max = 0, firstProduct = 0, secondProduct = 0;
		
		for ( int i = 100; i <= 999; i++) {
			for ( int j = 100; j <= 999; j++) {
				
				int n = i * j;
				
				String numberString = String.valueOf(n);

				//String reverseString = "";
				String reverseString = new StringBuilder(numberString).reverse().toString();
				
//				for ( int k = numberString.length()-1; k >= 0; k-- ) {
//					char charAt = numberString.charAt(k);
//					reverseString.append(charAt);
//				}
				
				if (reverseString.equals(numberString) && n > max) {
					//System.out.println(numberString);
					max = n;
					firstProduct = i;
					secondProduct = j;
				}
				
			}
		}
		
		System.out.printf("Il nostro numero palindromo è: %d che è la moltiplicazione di %d %d", max, firstProduct, secondProduct);
		
		
		
		

	}

}