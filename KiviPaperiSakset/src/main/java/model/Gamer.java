package model;

public class Gamer {
	private int voitot;
	private String[] valinta = {"kivi", "paperi", "sakset"};
	
	public Gamer() {
		voitot = 0;
	}
	
	public String pelaajanValinta() {
		return valinta[(int)(Math.random() * 3)];
	}
	
	public void setVoitot() {
		voitot++;
	}
	
	public int getVoitot() {
		return voitot;
	}

}
