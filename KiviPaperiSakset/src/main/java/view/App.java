package view;

import control.GameControl;
import model.Gamer;

public class App {
  public static void main(String[] args) {
	  
	  	Gamer pelaaja1 = new Gamer();
		Gamer pelaaja2 = new Gamer();
		
		GameControl game = new GameControl();
		
		game.setPelaajat(pelaaja1, pelaaja2);
		game.start();
  }
}
