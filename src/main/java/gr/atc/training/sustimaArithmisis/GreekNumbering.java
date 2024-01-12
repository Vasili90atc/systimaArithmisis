package gr.atc.training.sustimaArithmisis;


public class GreekNumbering {

	public void printInGreekNotation(int n) {
		if (n<1 || n>1000) {
			System.out.println("Number out of bounds");
			return;
		}
		System.out.print(n + " in Ancient Greek notation is: ");
		if ( n == 1000) System.out.println("͵A");
		
		int hundreds = (n/100) % 10;
		int dec = (n/10) % 10;
		int units = n%10;
		
		String hundreds_greek[] = {"Ρ΄", "Σ΄","Τ΄","Υ΄","Φ΄","Χ΄","Ψ΄","Ω΄","Ϡʹ"};
		String dec_greek[] = {"Ι΄","Κ΄","Λ΄","Μ΄","Ν΄","Ξ΄","Ο΄","Π΄","Ϟ΄"};
		String unit_greek[] = {"Α΄", "Β΄", "Γ΄", "Δ΄", "Ε΄", "ΣΤ΄", "Ζ΄", "Η΄", "Θ΄"};
		
		if (hundreds>0) System.out.print(hundreds_greek[hundreds-1]);
		if (dec>0) System.out.print(dec_greek[dec-1]);
		if (units>0) System.out.print(unit_greek[units-1]);
	
	}
	
}
