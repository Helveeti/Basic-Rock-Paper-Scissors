package control;

import model.Game;
import model.Gamer;

public class GameControl {
	private Game peli;
	private Gamer pelaaja1, pelaaja2;
	
	public GameControl() {
		peli = new Game();
	}
	
	public void setPelaajat(Gamer pelaaja1, Gamer pelaaja2) {
		this.pelaaja1 = pelaaja1;
		this.pelaaja2 = pelaaja2;
	}
	
	public boolean start() {
		if(pelaaja1 == null || pelaaja2 == null) {
			System.out.println("Aseta pelaajat.");
			return false;
		}
		else {
		
			while(pelaaja1.getVoitot() < 3 && pelaaja2.getVoitot() < 3) {
				
				System.out.println("Erä: " + peli.getKierros() + " =====================\n");
				System.out.println("Tasapelien lukumäärä: " + peli.getTasapelit() + "\n");
				
				String p1 = pelaaja1.pelaajanValinta();
				String p2 = pelaaja2.pelaajanValinta();
				
				System.out.println("Pelaaja 1: " + p1
		                + "\n\t Pelaaja 1:llä koossa " + pelaaja1.getVoitot() + " voittoa.");
		        System.out.println("Pelaaja 2: " + p2
		                + "\n\t Pelaaja 2:lla koossa " + pelaaja2.getVoitot() + " voittoa.");
		        
		        System.out.println(pelaa(p1, p2) + " voittaa kierroksen.\n");
			}
			
			System.out.println("KOLME VOITTOA - PELI PÄÄTTYY");
			
			return true;
		}
	}
	
	public String pelaa(String p1, String p2) {
		if(pelaaja1 == null || pelaaja2 == null) System.out.println("Aseta pelaajat.");
		else {
		
			peli.setKierros();
			
			if(p1.equals(p2)) {
				peli.setTasapeli();
				return "Tasapeli";
			}
			
			/* Palauttaa voittajan parametrina. */
			switch(p1) {
				case "kivi":
					if(p2.equals("sakset")) {
						pelaaja1.setVoitot();
						return "Pelaaja 1"; /* Kivi voittaa sakset. */
					}
					else {
						pelaaja2.setVoitot();
						return "Pelaaja 2"; /* Paperi voittaa kiven. */
					}
				case "paperi":
					if(p2.equals("kivi")) {
						pelaaja1.setVoitot();
						return "Pelaaja 1"; /* Paperi voittaa kiven. */
					}
					else {
						pelaaja2.setVoitot();
						return "Pelaaja 2"; /* Sakset voittaa paperin. */
					}
				case "sakset":
					if(p2.equals("paperi")) {
						pelaaja1.setVoitot();
						return "Pelaaja 1"; /* Sakset voittaa paperin. */
					}
					else {
						pelaaja2.setVoitot();
						return "Pelaaja 2"; /* Kivi voittaa sakset. */
					}
				default:
					return "Something went wrong.";
			}
		}
		
		return "Something went wrong.";
	}

}
