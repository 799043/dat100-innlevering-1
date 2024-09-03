package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class O2 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			
			String poeng = showInputDialog("Poengsum: ");
			int poengN = parseInt(poeng);
			
			while (poengN < 0 || poengN > 100) {
				String ny = showInputDialog("Skriv inn gyldig poeng: ");
				poengN = parseInt(ny);
			}
			
			int range = (poengN < 40 && poengN >= 0) ? 0: (poengN < 50 && poengN >= 40) ? 1: (poengN < 60 && poengN >= 50) ? 2: (poengN < 80 && poengN >= 60) ? 3: (poengN < 90 && poengN >= 80) ? 4: (poengN <= 100 && poengN >= 90) ? 5:6;
			
			switch(range) {
				case 0:
					System.out.println("Du fikk karakter F");
					break;
				case 1: 
					System.out.println("Du fikk karakter E");
					break;
				case 2:
					System.out.println("Du fikk karakter D");
					break;
				case 3:
					System.out.println("Du fikk karakter C");
					break;
				case 4:
					System.out.println("Du fikk karakter B");
					break;
				case 5:
					System.out.println("Du fikk karakter A");
					break;
				default:
					System.out.println("Ugyldig poeng");
					break;
			}
			System.out.println("Poengsum: " + poengN);
		}
	}
}

