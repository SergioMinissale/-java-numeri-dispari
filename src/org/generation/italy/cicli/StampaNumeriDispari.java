package org.generation.italy.cicli;
import java.util.Scanner;
import java.util.Random;
public class StampaNumeriDispari {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random gen = new Random();
		
		//richiesta all'utente lunghezza array
		System.out.print("Stabilisci quanti elementi vuoi nell'Array: ");
		int n= scanner.nextInt();
		//creo array	
		int[] numeri = new int[n];
		
		System.out.println("I numeri dispari presenti dentro all'Array sono i seguenti: ");
		
		int conteggioNumeriPari = 0;
		int conteggioNumeriDispari = 0;
	    int somma = 0;
		for (int i = 0; i < numeri.length; i++ ) {
			numeri[i] = gen.nextInt(100);
		    
			if (numeri[i] % 2 != 0) {
				System.out.println(numeri[i]);	
				conteggioNumeriDispari ++;
				
			} else { //conteggio numeri pari
				conteggioNumeriPari ++;	
			}
			
			
			
			if (numeri[i] > 10 && numeri[i] < 50) {
				somma += numeri[i];  
				//somma = somma + numeri[i];
				
			}
			    
		}
		System.out.println("La somma dei numeri all'interno dell'Array è: " + somma);
		System.out.println("In totale dentro questo Array ci sono: " + conteggioNumeriDispari + " numeri dispari" );
		System.out.println("In totale dentro a questo Array ci sono: " + conteggioNumeriPari + " numeri pari");	
				
		
		scanner.close();
	}
}
