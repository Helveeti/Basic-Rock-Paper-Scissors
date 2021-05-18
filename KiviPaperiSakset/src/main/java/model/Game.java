package model;

public class Game {
	
	private int kierrokset, tasapelit;
	
	public Game() {
		kierrokset = 0;
		tasapelit = 0;
	}
	
	public void setKierros() {
		kierrokset++;
	}
	
	public int getKierros() {
		return kierrokset;
	}
	
	public void setTasapeli() {
		tasapelit++;
	}
	
	public int getTasapelit() {
		return tasapelit;
	}

}
