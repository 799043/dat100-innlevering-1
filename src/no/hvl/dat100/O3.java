package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O3 {
	public static void main(String[] args) {
		String nummer = showInputDialog("Skriv inn heltall: ");
		int n = parseInt(nummer);
		int fact = 1;
		
		while (n <= 0) {
			String nyN = showInputDialog("Skriv inn gyldig heltall: ");
			n = parseInt(nyN);
		}	
		
		for(int i = 1; i <= n;i++) {
			fact = fact*i;
		}
		
		System.out.println("Nummeret n = " + n + " er da n! = " + fact);
	}
}
