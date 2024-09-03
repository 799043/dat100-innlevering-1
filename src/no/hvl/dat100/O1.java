package no.hvl.dat100;

import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;

public class O1 {
	public static void main(String[] args) {
		String inntekt = showInputDialog("Inntekt: ");
		double inntektN = parseDouble(inntekt);
		
		int range = (inntektN < 208050) ? 0: (inntektN >= 208050 && inntektN <= 292850) ? 1: (inntektN >= 292851 && inntektN <= 670000) ? 2: (inntektN >= 670001 && inntektN <= 937900) ? 3: (inntektN >= 937001 && inntektN <= 1350000) ? 4: (inntektN >= 1350001) ? 5:6;
		
		switch(range) {
		case 0:
			System.out.print("Trinnskatt i kr: " + 0);
			break;
		case 1:
			System.out.print("Trinnskatt i kr: " + (inntektN * (1.7/100)) + " kr");
			break;
		case 2:
			System.out.print("Trinnskatt i kr: " + (inntektN * (4.0/100)) + " kr");
			break;
		case 3:
			System.out.print("Trinnskatt i kr: " + (inntektN * (13.6/100)) + " kr");
			break;
		case 4:
			System.out.print("Trinnskatt i kr: " + (inntektN * (16.6/100)) + " kr");
			break;
		case 5:
			System.out.print("Trinnskatt i kr: " + (inntektN * (17.6/100)) + " kr");
			break;
		}
	}
}